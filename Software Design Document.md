
#Software Design Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 1.4

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

###Revision History
|Name|Date|Reason for Changes|Version|
|---|---|---|---|
|Christopher Gore|10/31|Creation of Document|1.0|
|Christopher Gore|10/31|Initial entries into Introduction and Database Sections|1.1|
|Daniel LaBorde|11/1|Initial entries into Development View|1.2|
|Daniel LaBorde|11/1|Initial entries into Physical View and Element Catalog (view key)|1.3|
|Daniel LaBorde|11/1|Minor fixes and added description in section 6 |1.4|
|Christopher Gore|11/1|Addition of description in section 5 and preliminary formatting in section 8|1.5|

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
