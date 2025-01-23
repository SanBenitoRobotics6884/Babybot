// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.SwerveSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class SwerveDrive extends Command {
  SwerveSubsystem m_swerveSubsystem;
  DoubleSupplier m_forward;
  DoubleSupplier m_rotation;
  DoubleSupplier m_strafe;

  /** Creates a new SwerveDrive. */
  public SwerveDrive(SwerveSubsystem subsystem, DoubleSupplier forward, 
                      DoubleSupplier rotation, DoubleSupplier strafe) {
    m_swerveSubsystem = subsystem;
    m_forward = forward;
    m_rotation = rotation;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    m_swerveSubsystem.driveRobotOriented(
        m_forward.getAsDouble(), m_rotation.getAsDouble());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
