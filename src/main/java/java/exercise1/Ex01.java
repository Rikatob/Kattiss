package java.exercise1;

public class Ex01 {

    public String regexPartA(){
        String regex = "(\\/[a-z\\d-*_*]+)*\\/test(\\/([a-z\\d-*_*])+)+(\\/[a-zA-Z\\d-*_*]+Test\\.(java|cpp|kt))";

        return regex;
    }

    // The regex will find (the path contains):

    // (\/[a-z\d-*_*]+)* --> folder -> start with slash -> any digit or lowercasing letter one or more times also includes '_' and '-' zero or many times-> can be zero or more folders.

    // \\/test --> must contain the folder "/test" in the path.

    // (\/([a-z\d-*_*])+)+ --> must contain a /folder once or more after the test-folder.

    // (\/[a-zA-Z\d-*_*]+Test\.(java|cpp|kt)) --> ends with the name of the test file -> /any lower or upper case letters, any number and must end with Test.java or Test.cpp or Test.kt.


    // assumptions:
    // the path can in theory start with the /test folder.
    // the test file will never lay directly in the test-folder.
    // all the folder names can only contain numbers, lower casing letters or '-' , '_' and the test folder will always be named "test" in lower casing.
    // the test file i assume will always start with a name of the method its testing follwed by Test, always written in camelcasing (Test will always be writen with uppercase 'T')
    // nobody uses other special characters than '_', '-' in folder or file names.
    // folders and files are named in english a-z or A-Z .


    // on the exam it is noted to call this "regexPartA" as well, but i assume its a misstype and call it "regexPartB".
    public String regexPartB(){
        //String regex ="(\\@[a-åA-Å]+:)( [ a-åA-Å\\d]+)*(( *[pP][gG]\\d{4})|( *[pP][gG][a-zA-Z]\\d{3})|( *[pP][rR][oO][gG][rR][aA][mM]{2}[iI][nN][gG])|( *[pP][rR][oO][gG][rR][aA][mM]{2}[eE][rR][iI][nN][gG])(( *[eE][xX][aA][mM])|( *[eE][kK][sS][aA][mM][eE][nN])))+( [ a-åA-Å\\d]+)*\\?";
        String regex = "((\\@[a-åA-Å]+:)(\\s[ a-åA-Å\\d]+)*((\\s*[pP][gG]\\d{4})|(\\s*[pP][gG][a-zA-Z]\\d{3})|(\\s*[pP][rR][oO][gG][rR][aA][mM]{2}[iI][nN][gG])|(\\s*[pP][rR][oO][gG][rR][aA][mM]{2}[eE][rR][iI][nN][gG]))+((\\s*.*[eE][xX][aA][mM])|(\\s*.*[eE][kK][sS][aA][mM][eE][nN]))+(\\s[ a-åA-Å\\d]+)*\\?)|((\\@[a-åA-Å]+:)(\\s[ a-åA-Å\\d]+)*((\\s*.*[eE][xX][aA][mM])|(\\s*.*[eE][kK][sS][aA][mM][eE][nN]))+((\\s*.*[pP][gG]\\d{4})|(\\s*.*[pP][gG][a-zA-Z]\\d{3})|(\\s*.*[pP][rR][oO][gG][rR][aA][mM]{2}[iI][nN][gG])|(\\s*[pP][rR][oO][gG][rR][aA][mM]{2}[eE][rR][iI][nN][gG]))+(\\s[ a-åA-Å\\d]+)*\\?)";
        return regex;
    }
    // this was a hard one, to get PG4200, pgr112, programming or programmering and also exam or eksamen was ok
    // , but to match with a char in between those two and also get it to match with exam/eksamen before and after feks pg4200 that was tricky.
    // ex should match : "exam in pg4200" and "pg4200 is the exam". ( pluss offcourse the other demands as @name, end with ? and so on)
    // i will not explain every part of the regex as in part a, as this regex became veeery long.




}
