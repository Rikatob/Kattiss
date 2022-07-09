package java.exercise2;

import java.util.*;

/**NOTES
 * This will only work for one change of transport.
 * This will not work if the person goes from start to a connected stop and then change transport.
 * in other words: "start" -> find connected "stop" that have path to "end" in the other transport.
 * im sorry to say i give up trying.
 */
public class Ex02<V> extends UndirectedGraph<V> {

    // Use the UndirectedGraph class to represent the graph of the metro and the graph of the tram.
    UndirectedGraph<V> metro = new UndirectedGraph<>();
    UndirectedGraph<V> tram = new UndirectedGraph<>();

    public List<V> findPath(V start, V end) {
        // some of these checks are in findPathDFS() method as well, but find it good to just "stop" the method at the very start if the input is not valid.

        // Makes no sense of having start or end as null.
        Objects.requireNonNull(start);
        Objects.requireNonNull(end);

        // if start equals to end you are already where your supposed to be and need no path.
        if (start.equals(end)) {
            throw new IllegalArgumentException();

        }
        // if start or end node dont exists in the graph.
        if (!graph.containsKey(start) || !graph.containsKey(end)) {

            return null;
        }

        List<V> metroPath = metro.findPathDFS(start, end);
        List<V> tramPath = tram.findPathDFS(start, end);

        // if there is a clear path without changing graph, from start to end in the metro graph, return that path.
        if (metroPath != null) {
            return metroPath;

        }
        // if there is a clear path without changing graph, from start to end in the tram graph, return that path.
        if (tramPath != null) {
            return tramPath;

        }

        // List that will contain the full path from start to end with one change of transport.
        List<V> changingTransportPath = null;

        // if start-vertex has any other vertex connected in the metro graph
        // -> loop through them and find the connected vertex that has a path to the end in the tram graph.
        // else loop through the vertexes that are connected to start in tram graph
        // -> find the connected vertex that has a path to the end in the metro graph.
        // add the start-vertex at the first index of the pathList.
        if (metro.getAdjacents(start) != null) {

            for (V mConnected : metro.getAdjacents(start)) {
                changingTransportPath = tram.findPathDFS(mConnected, end);

            }
        } else {

            for (V tConnected : tram.getAdjacents(start)) {
                changingTransportPath = metro.findPathDFS(tConnected, end);
            }
            changingTransportPath.add(0, start);
        }

        return changingTransportPath;
    }

}
