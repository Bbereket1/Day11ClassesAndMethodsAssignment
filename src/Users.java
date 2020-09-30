public class Users {

    private String firstname;
    private String lastname;
    private String email;
    private int phoneNumber;
    private String [] familyMembers;
    private String [] favoriteTVShows;
    private String [] favoriteMovies;
    private double lateFee;

    public Users(String firstname, String lastname, String email, int phoneNumber, String[] favoriteTVShows, String [] favoriteMovies) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.favoriteTVShows = favoriteTVShows;
        this.favoriteMovies = favoriteMovies;
        this.lateFee = 0;
    }

    public Users(String[] familyMembers, String[] favoriteTVShows, String[] favoriteMovies) {
        this.familyMembers = familyMembers;
        this.favoriteTVShows = favoriteTVShows;
        this.favoriteMovies = favoriteMovies;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(String [] familyMembers) {
        this.familyMembers = familyMembers;
    }

    public String[] getFavoriteTVShows() {
        return favoriteTVShows;
    }

    public void setFavoriteTVShows(String[] favoriteTVShows) {
        this.favoriteTVShows = favoriteTVShows;
    }

    public String[] getFavoriteMovies() {
        return favoriteMovies;
    }

    public void setFavoriteMovies(String[] favoriteMovies) {
        this.favoriteMovies = favoriteMovies;
    }

    public double getLateFee() {
        return lateFee;
    }

    public void setLateFee(double lateFee) {
        this.lateFee = lateFee;
    }
    public void setLateFee(int numberOfDaysLateFromDueDate) {
        double chargesForDaysLate = numberOfDaysLateFromDueDate*2.5;
        this.lateFee += chargesForDaysLate;
    }
}
