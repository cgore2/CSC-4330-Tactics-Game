#Project Management Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 1.15

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
###4. Configuration Management & Version Control
    1. Overview
    2. Version Structure
    3. Programming Methodology and Commenting
###5. Management of Deliverables
    1. Timeline of Project and Deliverables
    2. Fabrication Schedule
    3. Quality Assurance
    4. Team Responsibilites
###6. Risk Management
    1. Sources of Risk
    2. Time Management
    3. Technical Risk Management
###7. Post-Mortem
    1. Unimplemented Features in demo
    2. Potential Future of the Project
    
###Appendix 
    Meeting Schedule and Notes

###Revision History
|Name|Date|Reason for Changes|Version|
|---|---|---|---|
|Stephen Harb|10/30|Creation of Document|1.0|
|Stephen Harb|10/30|Section 1 introduction inclusion|1.1|
|Stephen Harb|10/30|Section 2 Objectives Inclusion|1.2|
|Stephen Harb|10/30|Adding all the Subsection titles|1.3|
|Stephen Harb|10/30|Inclusion of section 8|1.4|
|Stephen Harb|10/30|Inclusion of section 5|1.5|
|Stephen Harb|10/30|Inclusion of section 3|1.6|
|Christopher Gore|10/30|Inclusion of Meeting Schedule and Notes|1.7|
|Christopher Gore|10/30|Minor edits|1.8|
|Stephen Harb|10/30|Inclusion of section 6|1.9|
|Christopher Gore|10/30|Inclusion of section 4|1.10|
|Stephen Harb|10/30|Inclusion of section 6 charts|1.11|
|Stephen Harb|10/30|Removal of section 7, section 8 renamed to 7|1.12|
|Christopher Gore|10/30|Inclusion of section 5.4|1.13|
|Christopher Gore|10/30|Minor changes|1.14|
|Mason Meredith|10/30|Minor changes|1.14|
|Daniel LaBorde|11/30|added my contributions to the project|1.15|


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

###4. Configuration Management & Version Control
####4.1. Overview 
Our group used IDEs such as Eclipse and NetBeans as platforms to program the game in.  Additionally, websites such as GitHub were used as a platform for version control.  In order to facilitate communication within the group texting, emails, and the GroupMe application were used to keep in contact.  
####4.2. Version Structure
Our group used GitHub as our primary source of version control and document management.  Originally, we started out with Google Drive as our source for documentation but switched over to GitHub in order to use its version integration and markdown formatting.  
####4.3. Programming Methodology and Commenting
Our code was created using the Java language and IDEs such as Eclipse and NetBeans were used to as platforms to facilitate coding and testing of the game.  


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
####5.4 Team Responsibilities
The team worked together using an egoless leadership style  

Chris: Secretarial duties including taking meeting notes, managing documentation, communicating with the client, and assisting in coding the games logic.  

Daniel: Research into the assets needed for the game, management of media and functionality of the GUI, and error control.  

Mason: Worked on document editing and troubleshooting as quality assurance on finished product.  

Stephen: Acquisition of art assets, communication between team members, and error checking.  

###6. Risk Management
####6.1. Sources of Risk
The Main Sources of Risk are measured on likeliness and risk factor, from a range of 1-5, where a 1 is unlikely and a 5 is neatly guaranteed for likeliness, and a 1 for risk is unlikely to harm the final product, and a 5 leaves the team unable to develop further:  
Time Management; Likeliness 5, Risk 3  
Time management represents the most likely and most dangerous risk to the project. If the team does not manage time correctly, this will propagate into worse and more dangerous problems. Thus time management is the most important issue to address first.   
Design Software Failure; Likeliness 3, Risk 2  
A failure of the software used to design the system would be an issue, but easily recoverable due to the large availability of design environments for the type of game proposed.   
Team Member Drop/Quit; Likeliness 2, Risk 2  
The event of a team leaving for any reason would be a huge loss to the team, but other team members would be able to overcome the extra work load.   
Design Road Blocks; Likeliness 5, Risk 1  
Design road blocks are guaranteed and one of the most common push backs to the timeline, however, with four team members it is unlikely that every team member will be unable to work through an issue at once halting the entire process of development  
Communication Failure; Likeliness 2, Risk 5   
A lack of communication would leave the team unable to develop further and each member would be developing alone  
####6.2. Time Management
Time management was observed and maintained in two ways. First through team communication and accountability. Members of the team had to stay in contact with each other on a near daily bases, meaning the time was managed as a group. A preliminary timeline was created in the first incarnation of a team contract, and while that was not adhered to, the team still followed the ideology of this timeline as a structure for the project.  Two charts were used for timelines to handle time mangement. the first is an abandoned preliminary review of a potential timeline, the second was what we actually did and what documents we actually had to generate.

![alt tag](https://cloud.githubusercontent.com/assets/16145394/20735793/0d39ed7e-b668-11e6-8999-2303c3d3d10c.PNG)  
Figure 2. Preliminary Chart for potential timeline and documents  

![alt tag](https://cloud.githubusercontent.com/assets/16145394/20735798/163a5044-b668-11e6-9756-83928fd7fdf9.PNG)  
Figure 3. Actual Timeline and Chart for delivered Documents  

####6.3. Technical Risk Management Strategy
Technical risks were managed mostly through version control and team cooperation. The team ran into a failure of the use of unity and had to vote on switching development to a new platform and programming language part of the way through development and this aspect of risk.

###7. Post-Mortem
####7.1. Unimplemented Features in demo
The demo for SDMC did not include many of the planed features. The primary lacking features were assets. The SDMC demo does not include any sound assets, combat animations, movement animations, additional menu screens, or alternative backgrounds. This detracts heavily from the play experience described in our documents. Other un-included features are the lack of differentiated units, and the lack of additional play levels that would be crucial to the full experience of a tactical game. The final lacking feature that was promised was the settings control. This would have been a menu screen that could control brightness and sound volume. 

####7.2. Potential Future of the Project
For future features, implementing the un-included features into the demo would be mandatory. Another main area that needs to be developed is a cross platform implementation, potentially even a system that allows for online and mobile play. Background music for the game is nonexistent and would be a place to develop artistic depth into the game. There are multiple potential platforms this game could be marketed on, and they may need to be explored. The future of Sub-Dolphin Machine Cannon would be mostly completing the experience of the game.
 
###Appendix 
#### Meeting Schedule and Notes

8/29/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – First meeting with group members. Discussed possible ideas for project including a project based on measuring weather changes around LSU, a project involving image recognition, a project involving the use of GoPros and a couple of ideas for games.

Mason Meredith: Simple discussion of ideas, some in meeting research, and later research into some of the potential ideas. 

Daniel LaBorde: I met with the group, got to know everyone, and discussed project ideas.

9/6/16 – Chris Gore, Stephen Harb, Daniel LaBorde – Finalized our decision on what project we wanted, assigned roles to members, and created a basic outline for the project.

Mason Meredith: I failed to attend this meeting due to the flood work with my family. 

Daniel LaBorde: I picked my role for the project and worked on our first presentation.

9/29/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed basic design features needed to implement the project including a grid system for our game board and the information needed to build individual units. Discussed which engine to use to make the game in.

Mason Meredith: This was primarily a idea meeting, but I did suggest working with gamemaker though in the end we went with Unity. 

Daniel LaBorde: discussed game design with everyone.

10/21/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met up to work on SRS document as a group. Combined individual entries into a single document.

Mason Meredith: I contributed to the first addition of functional requirements, changes to sections 3-4, additions to sections 2-5, addition of user class flowcharts, addition to Sections 3 and 5, and addition of the menu diagram.

Daniel LaBorde: completed section 5 of our SRS document

10/24/16 – Chris Gore, Mason Meredith – Spent meeting discussing and getting acquainted with the Unity engine.

Mason Meredith: Simple meeting were I started to explore unity on my computer, and discuss future uses. 

10/25/16 - Daniel LaBorde - created the two dolphin sprites and other textures usings paint.net

11/2/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on Software Design Document as a group. Integrated our individual contributions and edited each other’s contributions to the document.

Mason Meredith: I added the initial entry into Main System Architecture for sub section iv to section 1, edited 2 and 6 heavily, and did two separate sweeps to ensure no contradictions or grammar errors. 

Daniel LaBorde: created the development view diagram and added my sample dolphin sprite.

11/7/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Began separation of coding duties and implementing classes and the basic framework to be used in our project. Included are creating the unit class and all fields needed for the dolphin units which was implemented by Chris Gore and Daniel LaBorde. The background and the basics of the game board was assigned to Stephen Harb. Lastly, the Player class involving what is to be controlled by the players was to be implemented by Mason Meredith.

Mason Meredith: Simple duty assignments. Each of us were more or less equally involved in this meeting. 

Daniel LaBorde: discussed and got assigned coding duties.

11/10/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed further details on project implementation. Discussions on abandoning Unity engine due to difficulties the team had with working with the engine.

Mason Meredith: In this meeting I mainly was the advocate for the Unity. 

Daniel LaBorde: discussed details on project implementation.

11/14/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Discussed further details on project implementation. Team voted against the use of Unity and began reworking code to be used in our own game engine developed using Java.

Mason Meredith: In this meeting I gave up the fight for unity, and instead focuses on understanding how the game would work in java.

Daniel LaBorde: voted to make our game engine in java.

11/17/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on Software Testing Document and integrate test cases worked on individually. Looked over each other’s work and edited test cases.

Mason Meredith: Created test case 10 and ll.

Daniel LaBorde: created test cases 0-4.

11/22/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Further discussions regarding the teams coding duties and what we would be working on over the break.

Mason Meredith: I discussed the structure mostly. 

11/24/16 - Daniel LaBorde: I did the research for implementing the external game libraries used for our game (LWJGL, OpenGL, Slick-util).

11/25/16 - Daniel LaBorde: I wrote out the main architecture for the code. Inlucding the Start, Player, Square, Painter, SqType, and SqGrid classes and all of their methods. Not including the methods written or changed later on by team members. 

11/26/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to work on code in a group setting.

Mason Meredith: I worked creating a partial project of all areas of the full project, but it was discarded for a superior design.

Daniel LaBorde: worked with the group to edit and fix our code.

11/27/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Made finishing touches on code. Made finalized version of PowerPoint presentation. Filmed video of project demo and discussed what we would be saying during the presentation.

Mason Meredith: I coded a good portion of movement, collision, and parts of attack in paired programming. 

Daniel LaBorde: made more edits and fixes to the code.

11/28/16 – Chris Gore, Stephen Harb, Daniel LaBorde, Mason Meredith – Met to do an extra couple of run-throughs of the presentation and make sure we all knew our parts.

Mason Meredith: I was in charge of practicing the demo slides/ timing the presentation.

Daniel LaBorde: practiced our final presentation with the group

11/29/16 – Daniel LaBorde, Mason Meredith – Meeting to fix java documentation and make minor changes to parts of the code. Meeting occurred via GroupMe.

Mason Meredith: I worked on all “square” program documents.

Daniel LaBorde: worked on documentation for Start, Player, and Painter.

11/29/16 – Chris Gore, Stephen Harb – Meeting to go over Project Management Document and consolidate information.


