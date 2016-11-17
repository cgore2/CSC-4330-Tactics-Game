Software Testing Document

Group: SDMC

Team Members: Christopher Gore, Stephen Harb, Daniel LaBorde, Mason Meredith

Version 0.7

|Name|Date|Reason for Changes|Version|
|---|---|---|---|
|Christopher Gore|11/17|Created Test Case 7|0.4|
|Christopher Gore|11/17|Created Test Case 8|0.4|
|Mason Meredith |11/17|Created Test Case 10|0.5|
|Mason Meredith |11/17|Created Test Case 11|0.5|
|Daniel LaBorde |11/17|Created Test Case 0|0.6|
|Daniel LaBorde |11/17|Created Test Case 1|0.6|
|Daniel LaBorde |11/17|Created Test Case 2|0.6|
|Daniel LaBorde |11/17|Created Test Case 3|0.6|
|Daniel LaBorde |11/17|Created Test Case 4|0.6|
|Christopher Gore|11/17|Minor deletions|0.7|

|Test Case 0|
|---|
|Test Case #0: Test Application Startup
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Tests the startup of the application 
|Test Case Name: Start Application Test  
|Subsystem: 
|Design Date: 11/17/2016|

|Preconditions| 
|---|
| The hardware used to run the application is turned on|
|The hardware is capable of running the application|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1| Run the application | The system displays the main menu GUI || ||
|2| Check post-condition 1|| ||

|Post Conditions|
|---|
|1. The application is running|

|Test Case 1|
|---|
|Test Case #1: Test Game Play Button
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Tests if the game play button reacts to being clicked 
|Test Case Name: Game Play Button Test
|Subsystem: Menu  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
| The application is running|
| The system is displaying the main menu|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1| Click the ‘Game Play’ button | The system displays the game screen || ||
|2| Check post-condition 1|| ||

|Post Conditions|
|---|
|1. The game screen is displayed|

|Test Case 2|
|---|
|Test Case #2: Test Settings Button
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Tests if the settings button reacts to being clicked 
|Test Case Name: Settings Button Test
|Subsystem: Menu  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
| The application is running|
| The system is displaying the main menu|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1| Click the ‘Settings’ button | The system displays the settings menu screen || ||
|2| Check post-condition 1|| ||

|Post Conditions|
|---|
|1. The settings screen is displayed|

|Test Case 3|
|---|
|Test Case #3: Test Level Select Button
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Tests if the level select button reacts to being clicked 
|Test Case Name: Level Select Button Test
|Subsystem: Menu  
|Design Date: 11/17/2016|


|Preconditions| 
|---|
| The application is running|
| The system is displaying the main menu|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1| Click the ‘Level Select’ button | The system displays the level select menu screen || ||
|2| Check post-condition 1|| ||

|Post Conditions|
|---|
|1. The level select screen is displayed|


|Test Case 4|
|---|
|Test Case #4: Test Game Start
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Tests if game is initialized 
|Test Case Name: Game Start Test
|Subsystem: Game Play
|Design Date: 11/17/2016|

|Preconditions| 
|---|
| The application is running|
| The ‘Game Play’ button has been clicked and the system is displaying the game play screen|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1| Check post-condition 1| || ||
|2| Check post-condition 2|| ||

|Post Conditions|
|---|
|1. The game is initialized|
|2. All units are initialized and in position|


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



|Test Case 7|
|---|
|Test Case #7: Test Unit Movement
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the in-game unit’s ability to move 
|Test Case Name: Test Unit Movement
|Subsystem: Game Play  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has chosen their units and has begun gameplay. Additionally, it is the players turn and the player has a selectable unit available.|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Selects an available unit|The system selects the unit| ||
|2|The user left clicks to select an available space|The system moves the unit| |

|Post Conditions|
|---|
|1. The unit is now in the selected space|

|Test Case 8|
|---|
|Test Case #8: Test Unit Attack
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the in-game unit’s ability to attack
|Test Case Name: Test Unit Attack
|Subsystem: Game Play  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has chosen their units and has begun gameplay. Additionally, it is the players turn and the player has a selectable unit available.|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Selects an available unit|The system selects the unit| ||
|2|The user left clicks to select an enemy unit to attack|The system targets the enemy unit to be attacked| ||

|Post Conditions|
|---|
|1. The enemy unit has now taken damage


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

|Test Case 10|
|---|
|Test Case #10: Test Setting Brightness Control
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Changes the brightness of the game interface only
|Test Case Name: Setting Brightness Control 
|Subsystem: Game Brightness  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has access to a Windows computer with brightness capabilities.|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Click the submenu button within the in-game play.| Submenu opens with all the submenu options including the brightness bar|| ||
|2|Click one of the segments in the brightness bar| The system lowers the game brightness according to which segment of the bar was pressed highlighting that segment|| ||
|3|Exit system submenu to reenter game|System reopens to the same game experience that the player previously inhabited|| ||

|Post Conditions|
|---|
|1. The correct highlighted segment will be ready when submenu reopened|

|Test Case 11|
|---|
|Test Case #11: Test Setting Brightness Control
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Game volume controls and volumes settings
|Test Case Name: Setting Volume Control 
|Subsystem: Game Volume  
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has access to a Windows computer with volume capabilities|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|Click the submenu button within the in-game play.| Submenu opens with all the submenu options including the volume bar|| ||
|2|Click one of the segments in the volume bar| The system lowers the game volume according to which segment of the bar was pressed highlighting that segment|| ||
|3|Exit system submenu to reenter game|System reopens to the same game experience that the player previously inhabited|| ||

|Post Conditions|
|---|
|1. The correct highlighted segment will be ready when submenu reopened|

|Test Case 12|
|---|
|Test Case #12: From Menu App closure
|System: Game Designed by: [SDMC]  
|Executed by: 
|Short Description: Test the in game exit feature 
|Test Case Name: From Menu App Closure  
|Subsystem: Menu
|Design Date: 11/17/2016|

|Preconditions| 
|---|
|The user has started the app, then in the menu the user selects the quit button or presses the esc key|

|Step|Action|Expected System Response|Pass/Fail|Comment|
|---|---|---|---|---|
|1|User enters the esc key or presses the quit button| Screen closes|| ||

|Post Conditions|
|---|
|1. The app closes|
