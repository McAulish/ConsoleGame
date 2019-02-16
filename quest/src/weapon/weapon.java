package weapon;

import com.quest.fight;

public abstract class weapon implements fight {
		protected String ownerName;
		protected int damage;
	
	public abstract void getDamage();

	public String getOwner() {
		return ownerName;
	}

	public void setOwner(String name) {
		this.ownerName = name;
	}

}
