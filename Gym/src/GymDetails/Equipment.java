package GymDetails;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Equipment {
    public String name;
    public String equipmentCode;
    public int quantity;
    public BufferedImage equipmentPhoto;

    public Equipment() {
    }
    public Equipment(String Name, String equipmentCode, int quantity) {
        this.name = Name;
        this.equipmentCode = equipmentCode;
        this.quantity = quantity;
    }

    private void loadPhoto(String photoPath) {
        //function that loads the photo.
        try {
            //this might have an error.
            File file = new File(photoPath);
            equipmentPhoto = ImageIO.read(file);
        } catch (IOException e) {
            //this is how we handle the error.
            System.out.println("Error loading the image: " + e.getMessage());
        }
    }

    public BufferedImage getPhoto() {
        //returns an object with the photo;
        return equipmentPhoto;
    }

    public void setPhoto(BufferedImage equipmentPhoto) {

        this.equipmentPhoto = equipmentPhoto;
    }

    public void initializeEquipmentWithPhoto(String photoPath) {
        loadPhoto(photoPath);

        // Retrieving and displaying the photo details
        BufferedImage photo = getPhoto();
        if (photo != null) {
            System.out.println("Loaded photo for " + name);
            System.out.println("Width: " + photo.getWidth() + " Height: " + photo.getHeight());
            // Other operations with the loaded photo can be performed here
        } else {
            System.out.println("No photo loaded for " + name);
        }
    }

    public void displayDetails() {
        System.out.println("Equipment Name: " + name);
        System.out.println("Equipment Code: " + equipmentCode);
        System.out.println("Quantity Available: " + quantity);
    }
}
