# SpinBot3Seconds
## Drivetrain.java
### fields
* 4 TalonSRX motors
* AHRS object that is needed to record the gyro values
### Constructor
* Instantiate the TalonSRX motors.
    * Pass in the correct port values.
* Make the back motors follow the front motors
* Set the right motors to be inverted
* Instantiate the AHRS object
### periodic()
* Call the updateDashboard() method 
### updateDashboard()
* Use SmartDashboard to output the gyro and encoder values into the dashboard
* To get the gyro value, use the getAngle() method of the AHRS object
* To get the encoder value, use the getSelectedSensorPosition() of one of the motor objects
### rotateBot()
* Parameters: the speed of the right motors and the speed of the left motors - (double)
    * Remember: In order for the robot to rotate, the speed of the right motors must be opposite to the speed of the left motors. Meaning, one of the speeds must be negative.
      * Example to set speed: frontRightMotor.set(ControlMode.PercentOutput, speed);
* Use the parameters to set the speed of the front motors.
    * As the back motors follow the front motors, there is no need to set the speed of the back motors.
### stopBot()
* Set the speed of both the frint motors to 0. 
    * Example to set speed: frontRightMotor.set(ControlMode.PercentOutput, 0);
## Rotate3Seconds.java
### fields
* startTime - (double)
* Instance of the Drivetrain subsystem
### Constructor
* Instance of Drivetrain subsystem is passed in
    *  Use the passed in instance of the Drivetrain subsystem to instantiate the Drivetrain object field
* Initialize the startTime field
### initialize()
* Set the startTime field variable to the starting time. 
    *  Get the starting time by using the Timer.getFPGATimestamp() method
### execute()
* Call the rotateBot() method of the Drivetrain subsystem
    * Pass in two doubles that have the same magnitude, but one should be negative. This allows the robot to rotate.
### end()
* Call the stopBot() method of the Drivetrain subsystem. No parameters needs to be passed in.
### isFinished()
* Return true if three seconds have passed. 
    * To check if three seconds have passed, check if the difference between the starting time and Timer.getFPGATimestamp() is greater than 3
* Return false if three seconds have not passed.
* Side note: When this method returns true, the end() method is automatically called
## RobotContainer.java
### fields
* Instance of a Joystick. 
    * Pass in the correct port value.
* Instance of the Drivetrain subsystem
* You can initialize the fields here. No need to initialize them in the constructor.
### configureButtonBindings()
* Create an object of a JoystickButton. Make sure to pass in the Joystick object and the correct port value.
* Use the whenPressed() method of the JoystickButton to create an object of the Rotate3Seconds command, passing in the object of the Drivetrain subsystem field.
    * This line of code says that when the joystick button is pressed, the command is called. The command then calls methods of the Drivetrain subsystem, allowing the robot to rotate for three seconds.
