// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.ctre.phoenix6.hardware.CANcoder;
import com.ctre.phoenix6.hardware.TalonFX;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.Encoder;

/** Add your docs here. */
public class SwerveModule {
    SparkMax m_SteerMotor = new SparkMax(0, MotorType.kBrushless);
    TalonFX m_DriveMotor = new TalonFX(1);

    CANcoder m_SteerAbsoluteEncoder = new CANcoder(0);

    SimpleMotorFeedforward m_Drive = new SimpleMotorFeedforward(0, 0);
    SimpleMotorFeedforward m_Steer = new SimpleMotorFeedforward(0, 0);

    Encoder m_Coder = new Encoder(0 ,0);
}
