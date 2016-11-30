#Project Management Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 1.7

###Table of Contents
Table of Contents  
Revision History

###1. Introduction
    1. Purpose
    2. Intended Audience
    3. Scope
    4. Design Summary
###2. Objectives
    1. Interface Objectives
    2. Quality Attributes
###3. Design Process Model  
    1. Overview
    2 Design Dependancies
###4. Management & Version Control
    1. Overview
    2. Version Structure
    3. Programming Methodology and Commenting
###5. Management of Deliverables
    1. Timeline of Project and Deliverables
    2. Fabrication Schedule
    3. Quality Assurance
###6. Risk Management
    1. Sources of Risk
    2. Time Management
    3. Technical Risk Management
###7. Marketing Features & Player Elements
    1. Selling Features
    2. Conflict Elements
    3. Player Elements
###8. Post-Mortem
    1. Unimplemented Features in demo
    2. Potential Future of the Project
    
###Appendix 
    1. Meeting Schedule and Notes

###Revision History
|Name|Date|Reason for Changes|Version|
|---|---|---|---|
|Stephen Harb|10/31|Creation of Document|1.0|
|Stephen Harb|10/31|Section 1 introduction inclusion|1.1|
|Stephen Harb|10/31|Section 2 Objectives Inclusion|1.2|
|Stephen Harb|10/31|Adding all the Subsection titles|1.3|
|Stephen Harb|10/31|Inclusion of section 8|1.4|
|Stephen Harb|10/31|Inclusion of section 5|1.5|
|Stephen Harb|10/31|Inclusion of section 3|1.6|
|Christopher Gore|10/31|Inclusion of Meeting Schedule and Notes|1.7|



###1. Introduction
####1.1. Purpose
Team [SDCM] shall develop a tactical game based for the Windows pc. This project shall undergo a full project life-cycle, including gameplay testing. The game shall consist of player elements (Dolphins) and conflict elements (Sharks) that involve high-strategy and tactical decision making in a turn-based environment. Players shall be able to make decisions which effect gameplay in such a way that proper decisions shall lead to victory in the game. The game may include both computer vs player and player vs player gameplay, but not necessarily both. The game shall be called Sub-Dolphin Machine Cannon, or SDMC, which shares an acronym with the team name SDMC or Software Develop Machine Creation.

####1.2. Intended Audience
The following document is intended for reading for team members, LSU CSC students and LSU CSC staff. The document is organized around user experience development.

####1.3. Scope
Sub-Dolphin Machine is based on turn based tactical full-awareness games in the vein of chess and Square Enix’s Final Fantasy Tactics Advance as well as other games within the genre. The games main artistic contribution to the genre is the addition of armed dolphins. The game will involve deep turn based strategy and player advancement as well as the ability to control the in-game avatars, which will be dolphins with cannons on them. The player will progress through different levels of the game, level up, and unlock new items for customization along the way.

####1.4. Design summary
At this point in time the game Sub dolphin machine cannon has been defined as a turn based tactical game meant for windows users. Keeping this in mind the users should be able to easily access and play the game. The game is made unique by its implementation of dolphins in a turn based strategy genre. Further more the game offers the user the fun option to use more than just one type of unit but rather multiple battle units. This document will be outlining the conceptual and technical sides of the games design for increased understanding of the pre game maneuvering and in game play. The game will be based on object-oriented architecture, and will be able to easily add future levels in new releases of the game. Using this approach means that the system can change easily, but over all will remain more or less static. 

###2. Objectives
####2.1. Interface Objectives
The game interface has the highest design priority. The interface will involve selected movements and player involvement as well as the tactical structure for the game. The game interface will include the menu interface, the play interface, the tactical planning interface and the system options interface. These interfaces will be the main way that the player interacts with the game. 

####2.2. Quality Attributes
Robustness: In multiplayer, if users lose connection to each other. The system shall save the game and enable the users to reconnect to the game, once connection has been restored.  
Portability: The game will not require internet connection, allowing for more portability with less gameplay constraints.  
Usability: The games UI’s will be very easy to navigate, and the actual gameplay will be very straightforward. Yet, it will still allow for very strategic gameplay.  
Availability: Users with the proper devices to access the game will have access at all times.   

###3. Design Process Model 
####3.1. Overview
Extreme programming was the optimal design process for Team [SDMC]. As an egoless team that had four members of roughly equal skill, having team members work together on each area of code, and then prototype rapidly allowed for the most efficent development of code and a working product. Development was based off a UML created early on, however, while the UML was used as a base point fro design, as development went on, the system heiarchy was forced to change.

![alt tag](https://cloud.githubusercontent.com/assets/16145394/20734781/56429d92-b661-11e6-8be8-8263c146db84.png)  
Figure 1. UML For Project

####3.2 Design Dependancies
Team [SDMC] planed to use the Unity development engine to develop the GUI, the assumption waas that the team would be able to use the engine for free and have limitless access to the software. However, the team was not able to begin developing a game engine in Unity, and a decision was made to switch to Java. The System was designed using the OpenGL, Lightweight Java Game Liibrary, and Slick2D's Untility library. These libraries allowed for the development of a game engine as well as worked with the system architecture that the team had already created. 

###4. Management & Version Control
####4.1. Overview
####4.2. Version Structure
####4.3. Programming Methodology and Commenting
####4.4 Configuration Management 

###5. Management of Deliverables
####5.1. Timeline of Project and Deliverables
Note: See Appendix for meeting schedule and meeting minutes related to each document  
Documents Timeline:  
1. Software Requirements Specification- 10/21/16  
2. Software Design Document- 11/2/16  
3. Software Testing Document- 11/21/16  
4. Project Management Document- 12/2/16  

####5.2. Fabrication Schedule
Proramming started on 11/7/16. Each team member had seperate responsibilties to the code and the team. The original team structure fell apart as development furthered, with team members taking on roles as they came up and as they could fill them. Developmend of the game continued until 12/1/16. 

####5.3. Quality Assurance
Testing of the game was done itermidently through development. Every area of development was tested, and then as shown functional or nonfunctional were kept or abandoned. To assure quality, Team [SDMC] designed a testing document as well as set team members to be in charge of system and game testing. 
    
###6. Risk Management
####6.1. Sources of Risk
####6.2. Time Management
####6.3. Technical Risk Management

###7. Marketing Features & Player Elements
####7.1. Selling Features
####7.2. Conflict Elements
####7.3. Player Elements

###8. Post-Mortem
####8.1. Unimplemented Features in demo
The demo for SDMC did not include many of the planed features. The primary lacking features were assets. The SDMC demo does not include any sound assets, combat animations, movement animations, additional menu screens, or alternative backgrounds. This detracts heavily from the play experience described in our documents. Other un-included features are the lack of differentiated units, and the lack of additional play levels that would be crucial to the full experience of a tactical game. The final lacking feature that was promised was the settings control. This would have been a menu screen that could control brightness and sound volume. 

####8.2. Potential Future of the Project
For future features, implementing the un-included features into the demo would be mandatory. Another main area that needs to be developed is a cross platform implementation, potentially even a system that allows for online and mobile play. Background music for the game is nonexistent and would be a place to develop artistic depth into the game. There are multiple potential platforms this game could be marketed on, and they may need to be explored. The future of Sub-Dolphin Machine Cannon would be mostly completing the experience of the game.
 
###Appendix 
####1. Meeting Schedule and Notes

8/29/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – First meeting with group members.  Discussed possible ideas for project including a project based on measuring weather changes around LSU, a project involving image recognition, a project involving the use of GoPros and a couple of ideas for games.  

9/6/16 – Chris Gore, Stephen Harb, Daniel LaBorde – Finalized our decision on what project we wanted, assigned roles to members, and created a basic outline for the project.  

9/29/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed basic design features needed to implement the project including a grid system for our game board and the information needed to build individual units.  Discussed which engine to use to make the game in.  

10/21/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met up to work on SRS document as a group.  Combined individual entries into a single document.  

10/24/16 – Chris Gore, Mason Meredith – Spent meeting discussing and getting acquainted with the Unity engine.  

11/2/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on Software Design Document as a group.  Integrated our individual contributions and edited each other’s contributions to the document.  

11/7/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Began separation of coding duties and implementing classes and the basic framework to be used in our project.  Included are creating the unit class and all fields needed for the dolphin units which was implemented by Chris Gore and Daniel LaBorde.  The background and the basics of the game board was assigned to Stephen Harb.  Lastly, the Player class involving what is to be controlled by the players was to be implemented by Mason Meredith.  

11/10/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed further details on project implementation.  Discussions on abandoning Unity engine due to difficulties the team had with working with the engine.  

11/14/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed further details on project implementation.  Team voted against the use of Unity and began reworking code to be used in our own game engine developed using Java.  

11/17/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on Software Testing Document and integrate test cases worked on individually.  Looked over each other’s work and edited test cases.  

11/22/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Further discussions regarding the teams coding duties and what we would be working on over the break.  

11/26/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on code in a group setting.  Heavily edited some areas of the code including the Unit class and its subclasses.  

11/27/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Made finishing touches on code.  Made finalized version of PowerPoint presentation.  Filmed video of project demo and discussed what we would be saying during the presentation.  

11/28/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to do an extra couple of run-throughs of the presentation and make sure we all knew our parts.  

11/29/16 – Daniel LaBorde, Mason Meredith – Meeting to fix java documentation and make minor changes to parts of the code.  Meeting occurred via GroupMe.  

11/29/16 – Chris Gore, Stephen Harb – Meeting to go over Project Management Document and consolidate information.  
