// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.wpilibj.Encoder;

/** Add your docs here. */
public class SwerveModule {
    SparkMax m_SteerMotor = new SparkMax(0, MotorType.kBrushless);
    SparkMax m_DriveMotor = new SparkMax(1, MotorType.kBrushless);
    SimpleMotorFeedforward m_Drive = new SimpleMotorFeedforward(0, 0);
    SimpleMotorFeedforward m_Steer = new SimpleMotorFeedforward(1, 0.5);
    Encoder m_Coder = new Encoder(0 ,0);
}
