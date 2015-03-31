package metadata;
import java.util.ArrayList;

public class Character {
	
	String username;
	int c_id;
	String name;
	String ctype;
	int rewardpoint;
 	int hitpoint;
	int movementspeed;
	int skill;
	double xpos;
	double ypos;
	double zpos;
	double h;
	String teamid;
	int movement;
	boolean IsAttacking;
	
	ArrayList<Character> cmlist;
	
	public Character()
	{
		cmlist = new ArrayList<Character>();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getC_id() {
		return c_id;
	}

	public void setC_id(int c_id) {
		this.c_id = c_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCtype() {
		return ctype;
	}

	public void setCtype(String ctype) {
		this.ctype = ctype;
	}

	public int getRewardpoint() {
		return rewardpoint;
	}

	public void setRewardpoint(int rewardpoint) {
		this.rewardpoint = rewardpoint;
	}

	public int getHitpoint() {
		return hitpoint;
	}

	public void setHitpoint(int hitpoint) {
		this.hitpoint = hitpoint;
	}

	public int getMovementspeed() {
		return movementspeed;
	}

	public void setMovementspeed(int movementspeed) {
		this.movementspeed = movementspeed;
	}

	public int getSkill() {
		return skill;
	}

	public void setSkill(int skill) {
		this.skill = skill;
	}

	public double getXpos() {
		return xpos;
	}

	public void setXpos(double xpos) {
		this.xpos = xpos;
	}

	public double getYpos() {
		return ypos;
	}

	public void setYpos(double ypos) {
		this.ypos = ypos;
	}

	public double getZpos() {
		return zpos;
	}

	public void setZpos(double zpos) {
		this.zpos = zpos;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public String getTeamid() {
		return teamid;
	}

	public void setTeamid(String teamid) {
		this.teamid = teamid;
	}

	public int getMovement() {
		return movement;
	}

	public void setMovement(int movement) {
		this.movement = movement;
	}

	public boolean isIsAttacking() {
		return IsAttacking;
	}

	public void setIsAttacking(boolean isAttacking) {
		IsAttacking = isAttacking;
	}

	public ArrayList<Character> getCmlist() {
		return cmlist;
	}

	public void setCmlist(ArrayList<Character> cmlist) {
		this.cmlist = cmlist;
	}

	
	
	
}