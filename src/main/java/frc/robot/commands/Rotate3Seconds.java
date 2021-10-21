// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.Timer;
import frc.robot.subsystems.Drivetrain;

public class Rotate3Seconds extends CommandBase {
  /** Creates a new Rotate3Seconds. */
  
  // create field variable startTime to set the starting time
  // create an instance of the Drivetrain subsystem

  public Rotate3Seconds(Drivetrain drivetrainIn) {
    // Use addRequirements() here to declare subsystem dependencies.
    // initialize fields
    // make sure Drivetrain subsystem is initialized with the passed in Drivetrain object
    addRequirements();
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    // set the start time using Timer.getFPGATimestamp()
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    // call the rotateBot() method of Drivetrain. 
    // make sure to pass in the right parameters. (to rotate the bot, the speeds of the right and left motors must be opposite)
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    // call the stopBot() method of Drivetrain.
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    // return true if three seconds have passed. hint: use Timer.getFPGATimestamp()
  }
}
