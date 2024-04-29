Introduction:
The Tamagotchi Application was developed in the early 1990's, and many developers have since then re-interpreted the application and it's code to create even more sophisticated applications like "My Pet Store", "Tom the cat", etc.
This report will detail the design and fucntionality of my Tamagotchi app called "Lekker Pets".
My application allows the user to virtually raise a pet by feeding, cleaning and playing with it.

Features:
The application has a welcome screen that introduces the application. From there you can enter the main application.
Once inside the application the user can start tracking the virtual pet's hunger, cleanliness and health levels. The user can also interact with the buttons to influence the pet's stats.
The app displays an image of the pet that changes based on it's stats.

Technical Specifcations:

Welcome Screen
- To develop the welcome screen, I created a Layout Resource File in the project folder and titled it "welcome_screen.xml"
- I then added an image of the pet (The image was pasted in the drawable folder, under resources)
- I also added a button that reads "Play Now" that directs users to the main application.
  
![Screenshot 2024-04-29 at 19 32 34](https://github.com/Zaakir97/TamagotchiApp/assets/166869482/961ab1f4-a7f8-45ba-9a02-08dc3ca53949)

Main application:
- In the main application we have three actions. There are three buttons, that are linked to three text views, which are also linked three image views.
- See below actions.
- Action 1: Feed button, hunger level text view, and hunger image
- Action 2: Clean button, cleanliness level text view and clean image
- Action 3: Play button, health text view and play image.
- In all three actions, we have a button, text view and image view that are connected to each other.
- How it works is that that if you click the feed button for example, the image view would change to a pet that is busy eating, and you'll notice that the number in the text view for "hunger" would increase by 1 everytime you click the button.

  ![Screenshot 2024-04-29 at 19 57 22](https://github.com/Zaakir97/TamagotchiApp/assets/166869482/421091b6-ca55-45ef-ae62-9bec855543c1)

![Screenshot 2024-04-29 at 18 33 03](https://github.com/Zaakir97/TamagotchiApp/assets/166869482/e44c5d7f-a237-43cf-b0a0-11e27f985313)

The application is very simple and intuitive, as it's able to track the stats of the Pet and the visual of the Pet changes according to the action of the button clicked.
