#Software Design Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 1.7

###Table of Contents
Table of Contents  
Revision History

1. Introduction
    1. Purpose
    2. Intended Audience
    3. Scope
2. Main system architecture (Logical view)
3. Sub-systems architecture   
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
|Christopher Gore|11/1|Added the user interface diagram|1.7|

###1. Introduction
####i. Purpose
Team [SDCM] shall develop a tactical game based for the Windows pc. This project shall undergo a full project life-cycle, including gameplay testing. The game shall consist of player elements (Dolphins) and conflict elements (Sharks) that involve high-strategy and tactical decision making in a turn-based environment. Players shall be able to make decisions which effect gameplay in such a way that proper decisions shall lead to victory in the game. The game may include both computer vs player and player vs player gameplay, but not necessarily both. The game shall be called Sub-Dolphin Machine Cannon, or SDMC, which shares an acronym with the team name SDMC or Software Develop Machine Creation.

####ii. Intended Audience
The following document is intended for reading for team members, LSU CSC students and LSU CSC staff. The document is organized around user experience development.
####iii. Scope
Sub-Dolphin Machine is based on turn based tactical full-awareness games in the vein of chess and Square Enix’s Final Fantasy Tactics Advance as well as other games within the genre. The games main artistic contribution to the genre is the addition of armed dolphins. The game will involve deep turn based strategy and player advancement as well as the ability to control the in-game avatars, which will be dolphins with cannons on them. The player will progress through different levels of the game, level up, and unlock new items for customization along the way.

###2. Main system architecture (Logical view)
###3. Sub-systems architecture 
###4. Rational for each architectural choice    
###5. Development view
![developmentdiagram](https://cloud.githubusercontent.com/assets/22534157/19913109/990cb0ea-a06d-11e6-907c-7ffbb4abeff4.png)

Description: The game will be built using the Unity game development engine and programmed using the C# programming language. 
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
