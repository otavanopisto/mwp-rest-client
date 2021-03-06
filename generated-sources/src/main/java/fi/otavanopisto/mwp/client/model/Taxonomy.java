/**
 * manage.kunta-api.dev
 * No descripton provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package fi.otavanopisto.mwp.client.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Taxonomy
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-11-30T14:46:18.068+02:00")
public class Taxonomy   {
  @JsonProperty("capabilities")
  private List<String> capabilities = new ArrayList<String>();

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("hierarchical")
  private Boolean hierarchical = null;

  @JsonProperty("labels")
  private Object labels = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("slug")
  private String slug = null;

  @JsonProperty("show_cloud")
  private Boolean showCloud = null;

  @JsonProperty("types")
  private List<String> types = new ArrayList<String>();

  public Taxonomy capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public Taxonomy addCapabilitiesItem(String capabilitiesItem) {
    this.capabilities.add(capabilitiesItem);
    return this;
  }

   /**
   * All capabilities used by the resource.
   * @return capabilities
  **/
  @ApiModelProperty(example = "null", value = "All capabilities used by the resource.")
  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }

  public Taxonomy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the resource.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "A human-readable description of the resource.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Taxonomy hierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
    return this;
  }

   /**
   * Whether or not the resource should have children.
   * @return hierarchical
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the resource should have children.")
  public Boolean getHierarchical() {
    return hierarchical;
  }

  public void setHierarchical(Boolean hierarchical) {
    this.hierarchical = hierarchical;
  }

  public Taxonomy labels(Object labels) {
    this.labels = labels;
    return this;
  }

   /**
   * Human-readable labels for the resource for various contexts.
   * @return labels
  **/
  @ApiModelProperty(example = "null", value = "Human-readable labels for the resource for various contexts.")
  public Object getLabels() {
    return labels;
  }

  public void setLabels(Object labels) {
    this.labels = labels;
  }

  public Taxonomy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The title for the resource.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The title for the resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Taxonomy slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the resource.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Taxonomy showCloud(Boolean showCloud) {
    this.showCloud = showCloud;
    return this;
  }

   /**
   * Whether or not the term cloud should be displayed.
   * @return showCloud
  **/
  @ApiModelProperty(example = "null", value = "Whether or not the term cloud should be displayed.")
  public Boolean getShowCloud() {
    return showCloud;
  }

  public void setShowCloud(Boolean showCloud) {
    this.showCloud = showCloud;
  }

  public Taxonomy types(List<String> types) {
    this.types = types;
    return this;
  }

  public Taxonomy addTypesItem(String typesItem) {
    this.types.add(typesItem);
    return this;
  }

   /**
   * Types associated with resource.
   * @return types
  **/
  @ApiModelProperty(example = "null", value = "Types associated with resource.")
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Taxonomy taxonomy = (Taxonomy) o;
    return Objects.equals(this.capabilities, taxonomy.capabilities) &&
        Objects.equals(this.description, taxonomy.description) &&
        Objects.equals(this.hierarchical, taxonomy.hierarchical) &&
        Objects.equals(this.labels, taxonomy.labels) &&
        Objects.equals(this.name, taxonomy.name) &&
        Objects.equals(this.slug, taxonomy.slug) &&
        Objects.equals(this.showCloud, taxonomy.showCloud) &&
        Objects.equals(this.types, taxonomy.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(capabilities, description, hierarchical, labels, name, slug, showCloud, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Taxonomy {\n");
    
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hierarchical: ").append(toIndentedString(hierarchical)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    showCloud: ").append(toIndentedString(showCloud)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

