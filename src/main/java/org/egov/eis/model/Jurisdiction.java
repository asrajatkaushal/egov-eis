/*
 * eGov suite of products aim to improve the internal efficiency,transparency,
 *    accountability and the service delivery of the government  organizations.
 *
 *     Copyright (C) <2015>  eGovernments Foundation
 *
 *     The updated version of eGov suite of products as by eGovernments Foundation
 *     is available at http://www.egovernments.org
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program. If not, see http://www.gnu.org/licenses/ or
 *     http://www.gnu.org/licenses/gpl.html .
 *
 *     In addition to the terms of the GPL license to be adhered to in using this
 *     program, the following additional terms are to be complied with:
 *
 *         1) All versions of this program, verbatim or modified must carry this
 *            Legal Notice.
 *
 *         2) Any misrepresentation of the origin of the material is prohibited. It
 *            is required that all modified versions of this material be marked in
 *            reasonable ways as different from the original version.
 *
 *         3) This license does not grant any rights to any user of the program
 *            with regards to rights under trademark law for use of the trade names
 *            or trademarks of eGovernments Foundation.
 *
 *   In case of any queries, you can reach eGovernments Foundation at contact@egovernments.org.
 */
package org.egov.eis.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Jurisdiction {
	@JsonProperty("id")
	private Long id;

	@JsonProperty("boundaryType")
	private Long boundaryType;

	@JsonProperty("boundary")
	private Long boundary;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBoundaryType() {
		return boundaryType;
	}

	public void setBoundaryType(Long boundaryType) {
		this.boundaryType = boundaryType;
	}

	public Long getBoundary() {
		return boundary;
	}

	public void setBoundary(Long boundary) {
		this.boundary = boundary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((boundary == null) ? 0 : boundary.hashCode());
		result = prime * result + ((boundaryType == null) ? 0 : boundaryType.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Jurisdiction))
			return false;
		Jurisdiction other = (Jurisdiction) obj;
		if (boundary == null) {
			if (other.boundary != null)
				return false;
		} else if (!boundary.equals(other.boundary))
			return false;
		if (boundaryType == null) {
			if (other.boundaryType != null)
				return false;
		} else if (!boundaryType.equals(other.boundaryType))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jurisdiction [id=" + id + ", boundaryType=" + boundaryType + ", boundary=" + boundary + "]";
	}
}
