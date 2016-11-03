#Software Design Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 2.0

###Table of Contents
Table of Contents  
Revision History

###1. Introduction
    1. Purpose
    2. Intended Audience
    3. Scope
    4. Design Summary
###2. Game system architecture (Logical view)
    1. Overview
    2. Game Maps 
    3. Sprites
    4. Player Control 
    5. Menu Interface
###3. Technical system architecture   
    1. Overview
    2. Game Maps 
    3. Sprites
    4. Player Control 
    5. Menu Interface
###4. Development view
    1. Overview
    2. Source Code Organization
    3. Programming Methodology and Commenting
###5. Physical view
###6. Database view
###7. Work-assignment view
###8. User interfaces
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
|Mason Meredith|11/2|Initial entry into Main System Architecture added iv to section 1|1.8|
|Christopher Gore|11/2|Removed section iv. from Main System Architecture & minor edits|1.9|
|Stephen Harb|11/2|Section 3 addition |1.10|
|Christopher Gore|11/2|Initial entry into Work Assignment View section|1.11|
|Stephen Harb|11/2|Full Rewrite of Section 3 |1.12|
|Stephen Harb|11/2|Change and reformat of section 10 |1.13|
|Christopher Gore|11/2|Rewrite of section 7|1.14|
|Mason Meredith|11/2| Editting 2 |1.15|
|Stephen Harb|11/2|Addition of Section 4 and rewrtite|1.16|
|Christopher Gore|11/2|Rewrite of Table of Contents & minor edits throughout document|1.17|
|Daniel LaBorde|11/2|Added the logical view diagram to section 2|1.18|
|Christopher Gore|11/2|Major rewrite of Work Assignment section & reassignment of section numbers|1.19|
|Mason Meredith|11/2| Editting 6 |1.20|
|Christopher Gore|11/2| Minor edits & reintroduction of Physical and Database sections |1.21|
|Mason Meredith, Christopher Gore, Stephen Harb, & Daniel LaBorde|11/2| Document Editting |2.0|

###1. Introduction
####1.1. Purpose
Team [SDCM] shall develop a tactical game based for the Windows pc. This project shall undergo a full project life-cycle, including gameplay testing. The game shall consist of player elements (Dolphins) and conflict elements (Sharks) that involve high-strategy and tactical decision making in a turn-based environment. Players shall be able to make decisions which effect gameplay in such a way that proper decisions shall lead to victory in the game. The game may include both computer vs player and player vs player gameplay, but not necessarily both. The game shall be called Sub-Dolphin Machine Cannon, or SDMC, which shares an acronym with the team name SDMC or Software Develop Machine Creation.

####1.2. Intended Audience
The following document is intended for reading for team members, LSU CSC students and LSU CSC staff. The document is organized around user experience development.

####1.3. Scope
Sub-Dolphin Machine is based on turn based tactical full-awareness games in the vein of chess and Square Enix’s Final Fantasy Tactics Advance as well as other games within the genre. The games main artistic contribution to the genre is the addition of armed dolphins. The game will involve deep turn based strategy and player advancement as well as the ability to control the in-game avatars, which will be dolphins with cannons on them. The player will progress through different levels of the game, level up, and unlock new items for customization along the way.

####1.4. Design summary
At this point in time the game Sub dolphin machine cannon has been defined as a turn based tactical game meant for windows users. Keeping this in mind the users should be able to easily access and play the game. The game is made unique by its implementation of dolphins in a turn based strategy genre. Further more the game offers the user the fun option to use more than just one type of unit but rather multiple battle units. This document will be outlining the conceptual and technical sides of the games design for increased understanding of the storage, pre game maneuvering, and in game play. The game will be based on object-oriented architecture, and will be able to easily add future levels in new releases of the game. Using this approach means that the system can change easily, but over all will remain more or less static. 

###2. Game System architecture 
####2.1 Overview  
The SDMC game is at its core a simple turn-based strategy game of the same type as Fire Emblem, or Age of The Empires. The game is focused on giving the user a fun experience in which they have to work moderately hard to achieve the victory scenarios of defeating all the enemy units. The game will be easy to navigate by using the computer keyboard to access various dropdowns and buttons in the 5 menus/interfaces. The Main menu is essentially a stop on the way to the destination of the 2D tile map. The Main menu leads to the skirmish menu. This menu allows for the unit choice of either sharks or dolphins. This was brought into the game to encourage a sense of overcoming an enemy other than dolphins in the game. The skirmish menu also holds the difficulty level of the game which was introduced newer players unfamiliar with the games mechanics. The 2D tile map is reached through the skirmish menu, and is the main stage of the game with moveable units capable of attack. 

![logicview](https://cloud.githubusercontent.com/assets/22534157/19952915/bc883ca0-a136-11e6-91b6-672f32181d97.png)

####2.2 Game Maps  
The Game Maps cannot be a blank plain, thus each tile in the maps holds a special significance. The tiles hold a cost for moment, and this encourages careful planning for sprite moment. The additional layer of strategy is furthered through the unique tiles like forests and grasslands. Furthermore, certain tiles can be impassable as well. For further details, see 2.3 sprites. 

####2.3 Sprites  
This stage of the game is fundamentally made up of sprite movement and action. Unit movement is dictate by tile type and unit type. Each unit holds stats like moment, attack, and defense. Thus, some units will move farther than other units, and different “terrain” will be either a hindrance or neutral for the units. Furthermore, units may attack other enemy units by moving directly next to the said unit and selecting the command attack. Thus, the strategic aspect of the game is furthered through careful planning of unit placement. 

####2.4 Player Control  
The navigation is based on the keyboards inputs from the respective windows computer. The buttons used will be the z, x and arrow buttons of the keyboard to move the selector. By using the keyboard, the user can select the dropdown and button boxes available for navigating the game. This allows an easy way to enter and exit the game at any given time. The z acts as a backspace and will access the current menus back button such as shut down in the main menu. Meanwhile the x acts as select. Finally, the arrow keys act exactly as expected in that they move up, down, left and right when possible. 

####2.5 Menu Interface   
The various Interfaces are vital for game navigation. The Main menu is essentially a stop on the way to the destination of the 2D tile map. From the Main menu the buttons include an "exit game" button, and a "skirmish" button. Once in the skirmish menu the game allows for the selection of difficulty, and unit types of (dolphins or sharks). Finally, the actual game is made up of a 2D tile map. 

###3. Technical system architecture 
####3.1. Overview
The game needs to be designed with user tactical ability as the focus. The system architecture shall be modulated into the game play engine, the player engine, the enemy engine, GUI, and artistic assets. The player engine inherits the gameplay engine The game is focused around the interaction with the player and enemy engine. The enemy engine inherits the abilities of the player engine, and includes an automated choice system which makes tactical decisions. The GUI shall include the menu and the modes of play.  Each technical system works with each other throughout operation of the game. The player engine, which includes control of units, control within the menu, selection of menu and options, and tactical planning control is the primary interface engine. The secondary interface engine is the GUI which shall render the screen and handle the artistic assets. The technical system shall include control and interface of the game maps and play maps. Inclusion of sprites on game screen and control of them. Player control shall dictate player owned sprites and shall also influence the menu interface. Victory conditions will be a method in the GUI, which will show that the player has won the level, and returns player to the main menu.

####3.2 Game Maps
Game maps are an element of the game play engine. The game maps shall run internally and be how the game interacts with the environment, as well as recording and manipulating the elements for GUI to control. Game maps shall be loaded from an assets folder and the elements on the page shall be interfaced with at runtime and not in preset conditions. 

####3.3 Sprites
Sprites are controlled by the engines. Sprites shall be held in an assets folder and rendered at runtime of the game after the player selects what units the team requires for the tactical play. Each sprite shall be handled by the GUI and manipulated by the appropriate engine. 

####3.4 Player Control
Player control is dictated by player engine; enemy player control is dictated by the enemy player engine. Player control is used to select from the menu, control unites, and select units for a tactical level. 

####3.5 Menu Interface
The menu interface is only controlled by the player engine and has elements controlled by the GUI. The menu interface has branching paths, and a menu screen, which shall be an artistic asset held in the assets folder which will be rendered at runtime of the game. 

###4. Development view
####4.1 Overview
The game will be built using the Unity game development engine and programmed using the C# programming language. The game shall be designed modularly with a spiral programming method. Collaboration shall mainly be through github. Assets shall be saved in an included folder. Each component of the software shall be saved within a directory for code control on unity.  Unity shall allow code from the git repository to be pushed to the Unity design folders. This allows testing of code to be smooth and without undue error.

####4.2 Source Code Organization 
The code shall be run through a play class, SDMC_RUN.cs. This class shall be associated with one main classes SDMC.cs which shall handle the game engine, the game engine is broken down into Player.cs, Enemy_Player.cs, Menu.cs, Map.h, Sprite.h, Audio.h. The play class runs the game and acts as a virtual wrapper for the rest of the code. 

####4.3 Programming Methodology and Commenting
Software shall be tested at each change to the system, as well as version incrementing, to prevent errors from backlogging. The software shall be heavily modulated such that any error within any header or function can be solved without significant restructuring to other pieces of the code. Comments shall include Javadoc commenting as well as line-by-line code explanation. 

###5. Physical View
The system will use the standard components used for a desktop or laptop including a keyboard and mouse/mousepad as the input devices.
###6. Database View
The project will not require that a database be implemented.
###7. Work-assignment view
All parts of the project will be worked on by all members of the team either as a whole or in pairs.  The reason for this is because the group is using an egoless approach to the games design and input from all members is required before major decisions are made for the project.  

While every member will have input into each part of the game certain sections will be focused on primarily by individuals.  

Team Responsibilities:  
Chris: Secretarial duties including taking meeting notes, managing documentation, communicating with the client, and assisting in coding the games logic.

Daniel: Research into the assets needed for the game, management of media and functionality of the GUI, and error control.

Mason: Worked on document editing and troubleshooting as quality assurance on finished product.

Stephen: Acquisition of art assets, communication between team members, and error checking.

###8. User interfaces
The following user interfaces are planned; menu/selection interface, tactical planning interface, play interface, and system options interface. 
Each interface will work as such:

![uidiagram](https://cloud.githubusercontent.com/assets/22534157/19916626/cb7c2ae4-a089-11e6-90dc-a7ebc9f5d121.png)

####8.1 Menu Interface
The Menu interface is described in 2.5 and 3.5. The interface allows the player to control and select what level the player will play and enter setting controls. 

####8.2 Level Selection Interface
The Level Selection Interface is the interface in which you select a specific map option. There will be numerous pre-created maps that offer a variety of strategic options and gameplay. Through this variety the user will be able to challenge themselves with different types of strategy. The levels with include wildly different types of terrain, and units present. 

####8.3 Tactical Planning Interface
This interface will have the options to pick either the dolphins or sharks in a drop down menu. These two sides each have certain boons to consider including attributes like attack, and defense 

####8.4 Play Interface
This interface will need a select function for each unit in play. Each unit will need a picture, and the select will cause a set of red squares to open for each moveable space. This unit will also have a small button at the bottom of the screen that will open the System Options Interface. When next to an enemy unit the friendly unit will set up an option to attack. By selecting this unit, the user can attack.
