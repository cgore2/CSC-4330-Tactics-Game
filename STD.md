Software Testing Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 0.3

|Test Cases|
|---|

|Preconditions|
|---|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|Step|Action|Expected System Response|Pass/Fail|Comment|

|Post Conditions|
|---|


|Test Case 5|
|---|
|Test Case #5: Test Player Unit Selection
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the selection feature for units under player control 
|Test Case Name: Unit Selection Test  
|Subsystem: Game Play  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has started the app, then selected the game play button. After the user selects the level to play in from the level selection screen, the user mouse’s over a unit and left clicks, the app the displays which unit was selected |

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Mouse Over Desired Unit| Selection notification|| ||
|2|Left-Click Unit|Unit Status is displayed| | |

|Post Conditions|
|---|
|1. The unit is the new selected unit|


|Test Case 6|
|---|
|Test Case #6: Test Unit status display  
|System: Game  Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the display feature for unit statistics and status 
|Test Case Name: Unit Status Display  
|Subsystem: Game Play  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has started the app, then selected the game play button. After the user selects the level to play in from the level selection screen, the user mouse’s over a unit and right clicks, the app displays the unit status on the screen.|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Mouse Over Desired Unit| Selection notification|| ||
|2|Right-Click Unit|Unit Status is displayed| | |

|Post Conditions|
|---|
|1. The unit is the new selected unit, status screen closes after five seconds|

|Test Case 9|
|---|
|Test Case #9: Test in game Exit Command
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the in game exit feature 
|Test Case Name: Unit Selection Test  
|Subsystem: Game Play  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has started the app, then selected the game play button. After the user selects the level to play in from the level selection screen, the user presses the esc key|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|User enters the esc key| Screen closes|| ||

|Post Conditions|
|---|
|1. The game closes|



Test Case #0: Start App  D+  
Test Case #1: Test Game Play button  D+  
Test Case #2: Test Setting button  D+  
Test Case #3: Test Level Selection button  D+  
Test Case #4: Test Game Start  D  
Test Case #5: Test Player Unit Selection  S+  
Test Case #6: Test Unit status display  S+  
Test Case #7: Test Unit Movement  C+  
Test Case #8: Test Unit Attack  C  
Test Case #9: Test in game Exit Command  S+  
Test Case #10: Test Setting Bightness Control    
Test Case #11: Test Setting Volume Control  M  
Test Case #12: From Menu App closure  M  
