package edu.wpi.first.wpilibj.KickBot2.templates.commands;

import edu.wpi.first.wpilibj.KickBot2.templates.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.KickBot2.templates.OI;

import edu.wpi.first.wpilibj.command.Command;

public class DriveBOT extends Command {
	public static DriveTrain drivetrain = new DriveTrain();

    public DriveBOT() {
        // Use requires() here to declare subsystem dependencies, eg. requires(chassis);
    	requires(drivetrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	drivetrain.m_drive.arcadeDrive(OI.ArcadeJoyStick);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
