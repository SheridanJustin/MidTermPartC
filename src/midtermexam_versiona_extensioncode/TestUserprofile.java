import java.util.Scanner;
import midtermexam_versiona_extensioncode.UserProfile;

public class TestUserprofile {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        String userID;
        String genreChoice;
        
        System.out.print("Please enter your UserID: ");
        userID = keyboard.nextLine();
        
        System.out.println("Please choose your favourite genre from the following options:");
        String[] genres = UserProfile.getGenres();
        for (int i = 0; i < genres.length; i++) {
                System.out.println(genres[i]);
             }
           genreChoice = keyboard.nextLine();

        
        // check if genreChoice is valid
       boolean validGenre = false;
    String[] genres2 = UserProfile.getGenres();
    for (int i = 0; i < genres2.length; i++) {
    if (genres[i].equals(genreChoice)) {
        validGenre = true;
        break;
    }
}

        
        if (validGenre) {
            
            System.out.println("Congratulations, your userProfile was created!");
        } else {
            System.out.println("Invalid genre choice, please try again.");
        }
    }
}
