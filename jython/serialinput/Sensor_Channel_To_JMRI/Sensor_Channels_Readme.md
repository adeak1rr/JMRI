JMRI Sensor Channels – Direct Arduino to JMRI Communications
More extensive information about this project can be found here:
JMRI Sensor Channels – Direct Arduino to JMRI Communications - Simple Support for Lots of Detectors --  https://model-railroad-hobbyist.com/node/34392

These files will allow you to connect up to 68 sensors to JMRI, and what to do to set up your sensors in JMRI. From there, you are on your own as far as this article goes. It will allow you to choose any kind of sensor that will pull a signal wire to ground (including the switch closure of old) and route it into a JMRI sensor table with minimal load/disturbance to JMRI. It will also automatically initialize all the sensors you have set up, upon connection to JMRI. The hardware connection will be made with most any off-the-shelf Arduino board (unmodified). These will connect via any USB port, to your computer running JMRI. 

This “Sensor Channel” is built with an Arduino Mega2560 controller and an optional Mega Sensor shield, for about $12-16 total depending on where you purchase them. The sensor shield board literally plugs into the top of the Mega2560 board, and has two screw terminals where you can connect a 5 Volt power supply to power the assembly and even the attached sensors.  

Load the appropriate Arduino sketch onto your favorite board, attach a sensor shield if needed, and leave the board connected to your computer that you will run JMRI. Now before you start JMRI you must either have just powered on your board, or simply hit the reset switch on your board.

Open JMRI and open your sensor table, which may only have one entry for ISCLOCKRUNNING. Go to the bottom of the Sensor table window and click Add… 
The System Connection: can be set for either internal or hardware addresses. I usually select “Internal” from the drop down pick. 
In the “Hardware Address” space simply put “0” (zero) this can be most anything you want within limits
In the “User Name” space simply put “AR”
Click the box for Add a sequential range
For the Number of items enter 69 for a Mega2560 and 19 for an UNO, Pro Mini, or a Nano
Then click on Create
Go back to your sensor table and click on the “User Name” label at the top of the column to get a clean sort by all the user names you just created
Now delete the entry for “AS” and “AS:1” since we will not be using them. You should now have 68 sensors left in the table with user names AS:2 through AS:68. These will be initialized by your mega at start up. Last save your work as a panel by using Panels-> Save Panels… and name and save for later.

From the JMRI menu  go to Panels -> Run Script and find your up to date Scan_Sensors.py file, but before you click on Open make sure you reset the Arduino Mega board (with the pushbutton).  Run the script and you should see all your sensor go from “Unnown” to either Inactive or Active depending on what you connected to each pin (remember connecting a digital signal pin (S) to ground (G or GND) will set the sensor active.