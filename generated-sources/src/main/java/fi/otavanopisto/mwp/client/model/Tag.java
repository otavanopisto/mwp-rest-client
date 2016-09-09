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


@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
/**
 * Tag
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-09-09T13:58:07.033+03:00")
public class Tag   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("count")
  private Integer count = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("link")
  private String link = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("slug")
  private String slug = null;

  /**
   * Type attribution for the resource.
   */
  public enum TaxonomyEnum {
    CATEGORY("category"),
    
    POST_TAG("post_tag"),
    
    NAV_MENU("nav_menu"),
    
    LINK_CATEGORY("link_category"),
    
    POST_FORMAT("post_format");

    private String value;

    TaxonomyEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TaxonomyEnum fromValue(String text) {
      for (TaxonomyEnum b : TaxonomyEnum.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("taxonomy")
  private TaxonomyEnum taxonomy = null;

  public Tag id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Unique identifier for the resource.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "Unique identifier for the resource.")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Tag count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of published posts for the resource.
   * @return count
  **/
  @ApiModelProperty(example = "null", value = "Number of published posts for the resource.")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public Tag description(String description) {
    this.description = description;
    return this;
  }

   /**
   * HTML description of the resource.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "HTML description of the resource.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Tag link(String link) {
    this.link = link;
    return this;
  }

   /**
   * URL to the resource.
   * @return link
  **/
  @ApiModelProperty(example = "null", value = "URL to the resource.")
  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public Tag name(String name) {
    this.name = name;
    return this;
  }

   /**
   * HTML title for the resource.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "HTML title for the resource.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Tag slug(String slug) {
    this.slug = slug;
    return this;
  }

   /**
   * An alphanumeric identifier for the resource unique to its type.
   * @return slug
  **/
  @ApiModelProperty(example = "null", value = "An alphanumeric identifier for the resource unique to its type.")
  public String getSlug() {
    return slug;
  }

  public void setSlug(String slug) {
    this.slug = slug;
  }

  public Tag taxonomy(TaxonomyEnum taxonomy) {
    this.taxonomy = taxonomy;
    return this;
  }

   /**
   * Type attribution for the resource.
   * @return taxonomy
  **/
  @ApiModelProperty(example = "null", value = "Type attribution for the resource.")
  public TaxonomyEnum getTaxonomy() {
    return taxonomy;
  }

  public void setTaxonomy(TaxonomyEnum taxonomy) {
    this.taxonomy = taxonomy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tag tag = (Tag) o;
    return Objects.equals(this.id, tag.id) &&
        Objects.equals(this.count, tag.count) &&
        Objects.equals(this.description, tag.description) &&
        Objects.equals(this.link, tag.link) &&
        Objects.equals(this.name, tag.name) &&
        Objects.equals(this.slug, tag.slug) &&
        Objects.equals(this.taxonomy, tag.taxonomy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, count, description, link, name, slug, taxonomy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tag {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    taxonomy: ").append(toIndentedString(taxonomy)).append("\n");
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
