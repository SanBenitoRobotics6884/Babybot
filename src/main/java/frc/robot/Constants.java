// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/** Add your docs here. */
public final class Constants {

    public static final class swerve {
        public static final int FL_DRIVE_MOTOR_ID = 1;
        public static final int FL_STEER_MOTOR_ID = 2;
        public static final int FR_DRIVE_MOTOR_ID = 3;
        public static final int FR_STEER_MOTOR_ID = 4;
        public static final int BL_DRIVE_MOTOR_ID = 5;
        public static final int BL_STEER_MOTOR_ID = 6;
        public static final int BR_DRIVE_MOTOR_ID = 7;
        public static final int BR_STEER_MOTOR_ID = 8;

        public static final int FL_ENCODER_ID = 9;
        public static final int FR_ENCODER_ID = 10;
        public static final int BL_ENCODER_ID = 11;
        public static final int BR_ENCODER_ID = 12;

        public static final int PIGEON_ID = 13;

        public static final boolean FL_MOTORS_INVERTED = true;
        public static final boolean FR_MOTORS_INVERTED = true;
        public static final boolean BL_MOTORS_INVERTED = true;
        public static final boolean BR_MOTORS_INVERTED = true;

        public static final double FL_MAGNETOFFSET = -0.379638671875;
        public static final double FR_MAGNETOFFSET = -0.320556640625;
        public static final double BL_MAGNETOFFSET = -0.15234375;
        public static final double BR_MAGNETOFFSET = 0.078369140625;

        public static final double DRIVE_kP = 0.001;
        public static final double DRIVE_kI = 0;
        public static final double DRIVE_kD = 0;

        public static final double STEER_kP = 0.001;
        public static final double STEER_kI = 0;
        public static final double STEER_kD = 0;

        public static final boolean SQUARED_INPUTS = true;
    }
}
