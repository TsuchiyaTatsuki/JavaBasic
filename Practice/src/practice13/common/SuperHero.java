package practice13.common;

public class SuperHero extends practice13.common.Hero{



		practice13.common.Item equipment;
		public int attack() {
			return super.attack() + equipment.getAdditionalDamage();


	}
		public practice13.common.Item getEquipment() {
			return equipment;
		}
		public void setEquipment(practice13.common.Item equipment) {
			this.equipment = equipment;
		}

}
