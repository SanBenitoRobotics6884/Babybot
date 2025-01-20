// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.Pigeon2;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.SwerveModule;

import static frc.robot.Constants.swerve.*;

public class SwerveSubsystem extends SubsystemBase {
  SwerveModule m_FLmodule = new SwerveModule
    (FL_DRIVE_MOTOR_ID, FL_STEER_MOTOR_ID, FL_ENCODER_ID, FL_MOTORS_INVERTED, FL_MAGNETOFFSET);
  SwerveModule m_FRmodule = new SwerveModule
    (FR_DRIVE_MOTOR_ID, FR_STEER_MOTOR_ID, FR_ENCODER_ID, FR_MOTORS_INVERTED, FR_MAGNETOFFSET);
  SwerveModule m_BLmodule = new SwerveModule
    (BL_DRIVE_MOTOR_ID, BL_STEER_MOTOR_ID, BL_ENCODER_ID, BL_MOTORS_INVERTED, BL_MAGNETOFFSET);
  SwerveModule m_BRmodule = new SwerveModule
    (BR_DRIVE_MOTOR_ID, BR_STEER_MOTOR_ID, BR_ENCODER_ID, BR_MOTORS_INVERTED, BR_MAGNETOFFSET);

  Pigeon2 m_gyro = new Pigeon2(0);

  /** Creates a new SwerveSubsystem. */
  public SwerveSubsystem() {
    m_gyro.optimizeBusUtilization();
    m_gyro.getYaw().setUpdateFrequency(50);
    m_gyro.getPitch().setUpdateFrequency(50);
    m_gyro.getRoll().setUpdateFrequency(50);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
