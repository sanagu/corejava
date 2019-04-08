package com.capgemini.spring.organization;
import  com.capgemini.spring.model.Address;
//import com.capgemini.spring.organization.address.*;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.*;
import javax.annotation.*;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

@Component
public class Organization {

	@Value("101")
	private int orgId;

	@Value("hp")
	private String orgName;

	@Value("2000")
	private double marketPrice;
	

	@Autowired
	@Qualifier("address")
	private Address address;

	@Resource(name="lists")
	private List<String> directors;

	@Resource(name="sets")
	private Set<String> branches;

	@Resource(name="maps")
	private Map<String, String> branchWiseHead;

	@Resource(name="ip")
	private Properties ipAddresses;

	@Resource(name="data")
	private Properties databaseDetails;

	public int getOrgId() {
		return orgId;
	}
	public void setOrgId(int orgId) {
		this.orgId = orgId;
	}
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public double getMarketPrice() {
		return marketPrice;
	}
	public void setMarketPrice(double marketPrice) {
		this.marketPrice = marketPrice;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<String> getDirectors() {
		return directors;
	}
	public void setDirectors(List<String> directors) {
		this.directors = directors;
	}
	public Set<String> getBranches() {
		return branches;
	}
	public void setBranches(Set<String> branches) {
		this.branches = branches;
	}
	public Map<String, String> getBranchWiseHead() {
		return branchWiseHead;
	}
	public void setBranchWiseHead(Map<String, String> branchWiseHead) {
		this.branchWiseHead = branchWiseHead;
	}
	public Properties getIpAddresses() {
		return ipAddresses;
	}
	public void setIpAddresses(Properties ipAddresses) {
		this.ipAddresses = ipAddresses;
	}
	public Properties getDatabaseDetails() {
		return databaseDetails;
	}
	public void setDatabaseDetails(Properties databaseDetails) {
		this.databaseDetails = databaseDetails;
	}
	@Override
	public String toString() {
		return "Organization [orgId=" + orgId + ", orgName=" + orgName + ", marketPrice=" + marketPrice + ", address="+ address + ", directors=" + directors + ", branches=" + branches + ", branchWiseHead=" + branchWiseHead+ ", ipAddresses=" + ipAddresses + ", databaseDetails=" + databaseDetails + "]";
	}

}
