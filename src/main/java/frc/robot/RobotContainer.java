// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import static frc.robot.Constants.swerve.SQUARED_INPUTS;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.Commands.SwerveDrive;
import frc.robot.Subsystems.SwerveSubsystem;

public class RobotContainer {
  XboxController m_controller = new XboxController(0);
  SwerveSubsystem m_swerveSubsystem = new SwerveSubsystem();

  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {}

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }

  SwerveDrive m_drive = new SwerveDrive(m_swerveSubsystem,
    () -> 3 * getLeftY(),
    () -> 3 * getRightX(),
    () -> 3 * getLeftX());

    private double getLeftY() {
      double leftX = -m_controller.getLeftX();
      double leftY = -m_controller.getLeftY();
      if (Math.hypot(leftX, leftY) < 0.1) {
        return 0;
      }
      if (!SQUARED_INPUTS) {
        return leftY;
      }
      double angle = Math.atan2(leftY, leftX);
      double magnitude = MathUtil.clamp(Math.pow(Math.hypot(leftX, leftY), 2), -1, 1);
      return magnitude * Math.sin(angle);
    }

     private double getLeftX() {
    double leftX = -m_controller.getLeftX();
    double leftY = -m_controller.getLeftY();
    if (Math.hypot(leftX, leftY) < 0.1) {
      return 0;
    }
    if (!SQUARED_INPUTS) {
      return leftX;
    }
    double angle = Math.atan2(leftY, leftX);
    double magnitude = MathUtil.clamp(Math.pow(Math.hypot(leftX, leftY), 2), -1, 1);
    return magnitude * Math.cos(angle);
  }

  private double getRightX() {
    double rightX = -m_controller.getRightX();
    if (Math.abs(rightX) < 0.1) {
      rightX = 0;
    }
    return rightX;
  }
}
