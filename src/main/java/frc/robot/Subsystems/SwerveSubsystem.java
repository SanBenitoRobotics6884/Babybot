// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix6.hardware.Pigeon2;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.SwerveModule;

public class SwerveSubsystem extends SubsystemBase {
  SwerveModule m_FLmodule = new SwerveModule(0, 0, 0, true, 0);
  SwerveModule m_FRmodule = new SwerveModule(0, 0, 0, true, 0);
  SwerveModule m_BLmodule = new SwerveModule(0, 0, 0, true, 0);
  SwerveModule m_BRmodule = new SwerveModule(0, 0, 0, true, 0);

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
