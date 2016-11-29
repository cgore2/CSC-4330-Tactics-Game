#Software Design Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 2.2

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
|Daniel LaBorde|11/2|Added development view diagram and sample dolphin sprite |2.1|
|Mason Meredith|11/2|Touch up in 1 and 2 to ensure no contradictions |2.2|


###1. Introduction
####1.1. Purpose
Team [SDCM] shall develop a tactical game based for the Windows pc. This project shall undergo a full project life-cycle, including gameplay testing. The game shall consist of player elements (Dolphins) and conflict elements (Sharks) that involve high-strategy and tactical decision making in a turn-based environment. Players shall be able to make decisions which effect gameplay in such a way that proper decisions shall lead to victory in the game. The game may include both computer vs player and player vs player gameplay, but not necessarily both. The game shall be call
