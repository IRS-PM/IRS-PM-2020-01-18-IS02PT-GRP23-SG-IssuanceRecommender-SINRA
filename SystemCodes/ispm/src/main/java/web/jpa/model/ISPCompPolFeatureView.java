package web.jpa.model;

import lombok.Data;
import lombok.Value;
import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Subselect;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
@Immutable
/*@Subselect(
    "SELECT `comp_pol_fea_view`.`WARD_CATEGORY`," +
            "    `comp_pol_fea_view`.`WARD_TYPE`," +
            "    `comp_pol_fea_view`.`POLICY_FEATURE`," +
            "    `comp_pol_fea_view`.`COMPANY`," +
            "    `comp_pol_fea_view`.`POLICY_NAME`," +
            "    `comp_pol_fea_view`.`BENEFITS`," +
            "    `comp_pol_fea_view`.`DESCRIPTION`" +
            "FROM `recommendersys`.`comp_pol_fea_view`;"
)*/
@Table(name = "comp_pol_fea_view")
public class ISPCompPolFeatureView {
    private @Id String policyFeatureId;
    private String wardCategory;
    private String wardType;
    private String policyFeature;
    private String company;
    private String policyName;
    private String benefits;
    private String description;

    public String getPolicyFeatureId() {
        return policyFeatureId;
    }

    public void setPolicyFeatureId(String policyFeatureId) {
        this.policyFeatureId = policyFeatureId;
    }

    public String getWardCategory() {
        return wardCategory;
    }

    public void setWardCategory(String wardCategory) {
        this.wardCategory = wardCategory;
    }

    public String getWardType() {
        return wardType;
    }

    public void setWardType(String wardType) {
        this.wardType = wardType;
    }

    public String getPolicyFeature() {
        return policyFeature;
    }

    public void setPolicyFeature(String policyFeature) {
        this.policyFeature = policyFeature;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getBenefits() {
        return benefits;
    }

    public void setBenefits(String benefits) {
        this.benefits = benefits;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

