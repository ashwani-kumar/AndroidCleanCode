
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
    "conditions",
    "forecast"
})
public class Features {

    @JsonProperty("conditions")
    private Integer conditions;
    @JsonProperty("forecast")
    private Integer forecast;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("conditions")
    public Integer getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Integer conditions) {
        this.conditions = conditions;
    }

    @JsonProperty("forecast")
    public Integer getForecast() {
        return forecast;
    }

    @JsonProperty("forecast")
    public void setForecast(Integer forecast) {
        this.forecast = forecast;
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
