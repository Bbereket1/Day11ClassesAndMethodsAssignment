import java.util.Arrays;

public class Media {
    /*

    Implement Netflix

    Create a Netflix app. At minimum, it should have a class for Media and a class for Users.
    It should also use the following concepts:

        Use getters/setters
        Use overloaded methods or overloaded constructors
        Have default values
    Beyond those parameters, create this any way you like and try to make it as elaborate as possible.
    Show me what you have learned in the (almost) two months you've been in this class!

     */
    public static void main(String[] args) {

        Users mainUser = new Users("Bereket", "Bekele", "berekettsegaye13@gmail.com",
                2065668628, new String [] {"The Sunset Sellers", "The BlackList"}, new String[] {"Real Steel", "The Take"});
        Users whoIsWatching = new Users( new String[]{"Sunny", "Tim", "Anthony"}, new String []{"The Vampire Diaries", "You", "Breaking Bad"},
                new String[]{"Bad teacher"});


        System.out.println(mainUser.getFirstname());
        System.out.println(Arrays.toString(mainUser.getFavoriteTVShows()));
        System.out.println((Arrays.toString(whoIsWatching.getFamilyMembers())));
        System.out.println(mainUser.getLateFee());
        mainUser.setLateFee(25);
        System.out.println(mainUser.getLateFee());
    }
}
