package org.mskcc.cbio.oncokb.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.mskcc.cbio.oncokb.model.Gene;
import org.mskcc.cbio.oncokb.model.RespMeta;

import java.util.HashSet;
import java.util.Set;


@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringMVCServerCodegen", date = "2016-05-08T23:17:19.384Z")
public class ApiGenes {

    private Set<Gene> data = new HashSet<Gene>();
    private RespMeta meta = new RespMeta();

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("data")
    public Set<Gene> getData() {
        return data;
    }

    public void setData(Set<Gene> data) {
        this.data = data;
    }

    /**
     **/
    @ApiModelProperty(value = "")
    @JsonProperty("meta")
    public RespMeta getRespMeta() {
        return meta;
    }

    public void setRespMeta(RespMeta meta) {
        this.meta = meta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApiGenes apiGenes = (ApiGenes) o;

        if (data != null ? !data.equals(apiGenes.data) : apiGenes.data != null) return false;
        if (meta != null ? !meta.equals(apiGenes.meta) : apiGenes.meta != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = data != null ? data.hashCode() : 0;
        result = 31 * result + (meta != null ? meta.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiGenes {\n");

        sb.append("  data: ").append(data).append("\n");
        sb.append("  data: ").append(meta).append("\n");
        sb.append("}\n");
        return sb.toString();
    }
}
