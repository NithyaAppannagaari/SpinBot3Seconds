// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */

  // create the four TalonSRX motors. 

  // create an AHRS object 

  public Drivetrain() {
    // instantiate the TalonSRX motors. input the right port values

    // make the back motors follow the front motors

    // set the right motors to be inverted

    // initialize all fields
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
    // call updateDashboard() method
  }

  private void updateDashboard()
  {
    // use SmartDashboard to output the gyro and encoder values into the dashboard
    // the getAngle() of the AHRS object is the gyro value
    // the encoder value is the getSelectedSensorPosition() of one of the motor objects
  }  

  public void rotateBot(double rightMotorSpeed, double leftMotorSpeed)
  {
    // set the speeds of the front motors.
  }

  public void stopBot()
  {
    // set the speeds of the front motors to 0.
  }
}
