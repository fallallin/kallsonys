package com.servientrega.modelo.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the servientrega_items database table.
 * 
 */
@Embeddable
public class ServientregaItemPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false)
	private String ordid;

	private String itemid;

	public ServientregaItemPK() {
	}
	public String getOrdid() {
		return this.ordid;
	}
	public void setOrdid(String ordid) {
		this.ordid = ordid;
	}
	public String getItemid() {
		return this.itemid;
	}
	public void setItemid(String itemid) {
		this.itemid = itemid;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof ServientregaItemPK)) {
			return false;
		}
		ServientregaItemPK castOther = (ServientregaItemPK)other;
		return 
			this.ordid.equals(castOther.ordid)
			&& this.itemid.equals(castOther.itemid);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.ordid.hashCode();
		hash = hash * prime + this.itemid.hashCode();
		
		return hash;
	}
}