// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.CANcoder;
import com.revrobotics.RelativeEncoder;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.Encoder;

/** Add your docs here. */
public class SwerveModule {
    SparkMax m_steerMotor = new SparkMax(0, MotorType.kBrushless);
    SparkMax m_driveMotor = new SparkMax(1, MotorType.kBrushless);

    CANcoder m_steerAbsoluteEncoder = new CANcoder(0);
    RelativeEncoder m_steerIntegratedEncoder = m_driveMotor.getEncoder();

    PIDController m_PID = new PIDController(0, 0, 0);

    SimpleMotorFeedforward m_drive = new SimpleMotorFeedforward(0, 0);
    SimpleMotorFeedforward m_steer = new SimpleMotorFeedforward(0, 0);
    Encoder m_encoder = new Encoder(0,0);
}
