// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.controls.VelocityVoltage;
import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;

/** Add your docs here. */
public class SwerveModule {
    SparkMax m_steerMotor;
    SparkMax m_driveMotor;
    SparkMaxConfig config;

    CANcoder m_steerAbsoluteEncoder;
    RelativeEncoder m_steerIntegratedEncoder;

    PIDController m_PID = new PIDController(0, 0, 0);
    VelocityVoltage m_voltage = new VelocityVoltage(0);

    SimpleMotorFeedforward m_drive = new SimpleMotorFeedforward(0, 0);
    SimpleMotorFeedforward m_steer = new SimpleMotorFeedforward(0, 0);

    public SwerveModule(int driveID, int steerID, int encoderID, boolean motorInverted) {
        m_driveMotor = new SparkMax(driveID, MotorType.kBrushless);
        m_steerMotor = new SparkMax(steerID, MotorType.kBrushless);
        config.inverted(motorInverted);
        m_driveMotor.configure(config, null, null);
        m_steerMotor.configure(config, null, null);

        m_steerAbsoluteEncoder = new CANcoder(encoderID);
        m_steerIntegratedEncoder = m_driveMotor.getEncoder();
    }
}
