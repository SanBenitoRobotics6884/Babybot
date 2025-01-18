// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class SwerveSubsystem extends SubsystemBase {
  SwerveModule m_FLmodule = new SwerveModule(0, 0, 0, true);
  SwerveModule m_FRmodule = new SwerveModule(0, 0, 0, true);
  SwerveModule m_BLmodule = new SwerveModule(0, 0, 0, true);
  SwerveModule m_BRmodule = new SwerveModule(0, 0, 0, true);
  
  /** Creates a new SwerveSubsystem. */
  public SwerveSubsystem() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
