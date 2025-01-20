// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.configs.MagnetSensorConfigs;
//import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.controller.PIDController;
//import edu.wpi.first.math.controller.SimpleMotorFeedforward;


import static frc.robot.Constants.swerve.*;

/** Add your docs here. */
public class SwerveModule {
  SparkMax m_steerMotor;
  SparkMax m_driveMotor;
  SparkMaxConfig config;

  CANcoder m_steerAbsoluteEncoder;
  RelativeEncoder m_steerEncoder;
  RelativeEncoder m_driveEncoder;

  /**
  VelocityVoltage m_voltage = new VelocityVoltage(0);

  SimpleMotorFeedforward m_drive = new SimpleMotorFeedforward(0, 0);
  SimpleMotorFeedforward m_steer = new SimpleMotorFeedforward(0, 0);
  */

  public SwerveModule(int driveID, int steerID, int encoderID, boolean motorInverted, double magnetOffset) {
    m_driveMotor = new SparkMax(driveID, MotorType.kBrushless);
    m_steerMotor = new SparkMax(steerID, MotorType.kBrushless);
    config.inverted(motorInverted);
    m_driveMotor.configure(config, null, null);
    m_steerMotor.configure(config, null, null);

    MagnetSensorConfigs magnetConfig = new MagnetSensorConfigs();
    magnetConfig.MagnetOffset = magnetOffset;

    m_steerAbsoluteEncoder = new CANcoder(encoderID);
    m_steerEncoder = m_driveMotor.getEncoder();

    PIDController m_steerPID = new PIDController(DRIVE_kP, DRIVE_kI, DRIVE_kD);
    m_steerMotor.set(m_steerPID.calculate(m_steerEncoder.getPosition(), 0));
    PIDController m_drivePID = new PIDController(STEER_kP, STEER_kI, STEER_kD);
    m_steerPID.close();
    m_driveMotor.set(m_drivePID.calculate(m_driveEncoder.getPosition(), 0));
    m_drivePID.close();
  }
}
