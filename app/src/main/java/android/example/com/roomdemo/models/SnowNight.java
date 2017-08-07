
package android.example.com.roomdemo.models;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "in",
    "cm"
})
public class SnowNight {

    @JsonProperty("in")
    private Double in;
    @JsonProperty("cm")
    private Double cm;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("in")
    public Double getIn() {
        return in;
    }

    @JsonProperty("in")
    public void setIn(Double in) {
        this.in = in;
    }

    @JsonProperty("cm")
    public Double getCm() {
        return cm;
    }

    @JsonProperty("cm")
    public void setCm(Double cm) {
        this.cm = cm;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
