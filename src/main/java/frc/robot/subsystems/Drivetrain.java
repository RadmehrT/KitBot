package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {
    private final VictorSPX m_leftMotor0 = new VictorSPX(Constants.LEFT_MOTOR_0); 
    private final VictorSPX m_leftMotor1 = new VictorSPX(Constants.LEFT_MOTOR_1);
    private final VictorSPX m_rightMotor0 = new VictorSPX(Constants.RIGHT_MOTOR_0);
    private final VictorSPX m_rightMotor1 = new VictorSPX(Constants.RIGHT_MOTOR_1);

    public Drivetrain() {
        m_rightMotor0.setInverted(true);
        m_rightMotor1.setInverted(true);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        m_leftMotor0.set(ControlMode.PercentOutput, leftSpeed);
        m_leftMotor1.set(ControlMode.PercentOutput, leftSpeed);
        m_rightMotor0.set(ControlMode.PercentOutput, rightSpeed);
        m_rightMotor1.set(ControlMode.PercentOutput, rightSpeed);
    }

    public void stop() {
        tankDrive(0, 0);
    }
}