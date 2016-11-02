#Software Design Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 1.8

###Table of Contents
Table of Contents  
Revision History

1. Introduction
    1. Purpose
    2. Intended Audience
    3. Scope
    4. Design Summary
2. Main system architecture (Logical view)
    1. Overview
    2. Navigation
    3. Skirmish/ Campaign function
    4. Saved Game/ Load game
    5. Game movement/ action
3. Technical system architecture   
4. Rational for each architectural choice    
5. Development view
6. Physical view
7. Database view
8. Work-assignment view
9. Element catalog
10. User interfaces
    1. Menu Interface
    2. Tactical Planning Interface
    3. Play Interface
    4. Systems Options Interface

###Revision History
|Name|Date|Reason for Changes|Version|
|---|---|---|---|
|Christopher Gore|10/31|Creation of Document|1.0|
|Christopher Gore|10/31|Initial entries into Introduction and Database Sections|1.1|
|Daniel LaBorde|11/1|Initial entry into Development View|1.2|
|Daniel LaBorde|11/1|Initial entries into Physical View and Element Catalog (view key)|1.3|
|Daniel LaBorde|11/1|Minor fixes and added description in section 6 |1.4|
|Christopher Gore|11/1|Addition of description in section 5 and preliminary formatting in section 8|1.5|
|Christopher Gore|11/1|Initial entry into User Interface and updated Table of Contents|1.6|
|Christopher Gore & Stephen Harb|11/1|Added the user interface diagram|1.7|
|Mason Meredith|11/2|Initial entry into Main system architecture added 1.4|1.8|

###1. Introduction
####i. Purpose
Team [SDCM] shall develop a tactical game based for the Windows pc. This project shall undergo a full project life-cycle, including gameplay testing. The game shall consist of player elements (Dolphins) and conflict elements (Sharks) that involve high-strategy and tactical decision making in a turn-based environment. Players shall be able to make decisions which effect gameplay in such a way that proper decisions shall lead to victory in the game. The game may include both computer vs player and player vs player gameplay, but not necessarily both. The game shall be called Sub-Dolphin Machine Cannon, or SDMC, which shares an acronym with the team name SDMC or Software Develop Machine Creation.

####ii. Intended Audience
The following document is intended for reading for team members, LSU CSC students and LSU CSC staff. The document is organized around user experience development.
####iii. Scope
Sub-Dolphin Machine is based on turn based tactical full-awareness games in the vein of chess and Square Enix’s Final Fantasy Tactics Advance as well as other games within the genre. The games main artistic contribution to the genre is the addition of armed dolphins. The game will involve deep turn based strategy and player advancement as well as the ability to control the in-game avatars, which will be dolphins with cannons on them. The player will progress through different levels of the game, level up, and unlock new items for customization along the way.

####iv. Design summary 
	At this point in time the game Sub dolphin machine cannon has been defined as a turn based tactical game meant for windows users. Keeping this in mind the users should be able to easily access and play the game. The game is made unique by its implementation of dolphins in a turn based strategy genre. Further more the game offers the user the fun option to use more than just one type of unit but rather multiple battle units. This document will be outlining the conceptual and technical sides of the games design for increased understanding of the storage, pre game maneuvering, and in game play. The game will be based on object-oriented architecture, and will be able to easily add future levels in new releases of the game. Using this approach means that the system can change easily, but over all will remain more or less static. 

###2. Main system architecture (Logical view)
i. Overview  
The SDMC game is at its core a simple turn-based strategy game of the same type as Fire Emblem, or Age of The Empires. The game is focused on giving the user a fun experience in which they have to work moderately hard to achieve the victory scenarios of defeating all the enemy units. The game will be easy to navigate by using the computer keyboard to access various dropdowns and buttons in the 5 menus/interfaces. The Main menu is essentially a stop on the way to the destination of the 2D tile map. The Main menu leads to the skirmish and campaign menu.  These two menus also allow for the unit choice of either sharks or dolphins. This was brought into the game to encourage a sense of overcoming an enemy other than dolphins in the game. The skirmish and campaign menu also hold the difficulty level of the game and a possible saved game. These two features are introduced for a those unable to play the game for continued game enjoyment as well as ensuring that progress in the game is not lost. The 2D tile map is reached through either the campaign menu, or the skirmish menu, and is the main stage of the game with moveable units capable of attack. 

ii. Navigation 
	The navigation is based on the keyboards inputs from the respective windows computer. The buttons used will be the z, x and arrow buttons of the keyboard to move the selector. By using the keyboard the user can select the dropdown and button boxes available for navigating the game. This allows an easy way to enter and exit the game at any given time. The z acts as a backspace and will access the current menus back button such as shut down in the main menu. Meanwhile the x acts as select. Finally the arrow keys act exactly as expected in that they move up, down, left and right when possible. 

iii. Skirmish/ Campaign function
	This might appear to be a broad category, but in reality it underlines a straightforward difference. On the main menu the user will chose either a Campaign or a Skirmish mode. Put simply there will be two campaigns one being the dolphins(easy), and the other being the sharks(hard). The sharks are set at a disadvantage because you will start the game as sharks where the dolphin campaigns ends. So, as the dolphin campaign starts easy and gets slowly harder, the shark campaign goes from hard to harder. Thus, if the user chooses the sharks they will end up with a highly difficult game but if user pick dolphins the game will be easy. Meanwhile, the skirmish mode will be exactly as stated in the SRS document under External Interface Requirements at Tactical Planning Interface 3.1.6. So, skirmish mode will have a simple drop down with difficulty, and and a simple choice of dolphin or sharks with a preordained map. 


iv. Saved Game/ Load game
	The saved/ load game feature of the game is meant to be a progress-retaining feature. The game may take more time than can be completed in one sitting, so the save feature located in the SRS 3.1.7 Systems Option Interface is an easily reachable feature that is accessed by pressing z while on the 2D tile map and the navigating to the save button. Furthermore, to load the saved file simply navigate to the SRS 3.1.6 Tactical Planning Interface and select the “load game” button with x.

v. Game movement/ action
Once the user has actually selected a 2D tile map the game will begin. This stage of the game is fundamentally made up of unit movement and unit action. Unit movement is dictate by tile type and unit type. Each unit holds stats like moment, attack, and defense. Thus, some units will move farther than other units, and different “terrain” will be either a hindrance or neutral for the units. Furthermore, units may attack other enemy units by moving directly next to the said unit and selecting selecting the command attack. 


###3. Technical system architecture 
###4. Rational for each architectural choice    
###5. Development view
![developmentdiagram](https://cloud.githubusercontent.com/assets/22534157/19913109/990cb0ea-a06d-11e6-907c-7ffbb4abeff4.png)

The game will be built using the Unity game development engine and programmed using the C# programming language. 
###6. Physical view
![physicalview](https://cloud.githubusercontent.com/assets/22534157/19913205/69c45eea-a06e-11e6-8761-6b277f97ec00.png)

Description: All elements of the game can be accessed through a computer or mobile device. The device then interacts with the LAN server in order to connect with other players. No databases or other servers are needed. 
###7. Database view
A database will not be implemented in this project.  This section is kept in should the future iterations of this project call for the use of a database.
###8. Work-assignment view
The system logic will be handled by:  
The User Interface will be handled by:  
The art assets will be handled by:  
The game sound will be handled by:  
###9. Element catalog
![elementcatalog](https://cloud.githubusercontent.com/assets/22534157/19913211/7206a266-a06e-11e6-866b-cd8abd39e8aa.png)
###10. User interfaces
The following user interfaces are planned; menu/selection interface, tactical planning interface, play interface, and system options interface. 
Each interface will work as such:

![uidiagram](https://cloud.githubusercontent.com/assets/22534157/19916626/cb7c2ae4-a089-11e6-90dc-a7ebc9f5d121.png)

####i. Menu Interface
The main menu will require three basic “buttons.” The first button will be a link to shut down the game. The second button allows the user to view the tactical planning interface (campaign). The last button leads to the same tactical planning interface but it is (skirmish mode).

####ii. Tactical Planning Interface
This interface will have the options to pick either the dolphins or sharks in a drop down menu. These two sides each have certain boons to consider including attributes like attack, defense, or resources. Additionally, the tactical planning interface also allows the user to download previous games into a saved slot or overwrite the one saved slot.  This means that there are two buttons regarding this function one for a new game, and one for a continued game.  Finally, if it is a new game then the difficulty is re-set to either easy or hard with an additional two buttons. 

####iii. Play Interface
This interface will need a select function for each unit in play. Each unit will need a picture, and the select will cause a set of red squares to open for each moveable space. This unit will also have a small button at the bottom of the screen that will open the System Options Interface. When next to an enemy unit the friendly will turn to a new picture. By selecting this unit, the user can either attack (changing the color of the unit background), or defend (changing the color of the unit background). 

####iv. System Options Interface: 
This interface is a simpler interface that will require only an open menu with an “x” button at the top of the menu, a “save” button, and a “return to game” button.
