package pl.pjatk.RentalService.nbp.nbpmodel;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.List;

@ApiModel("Table of currency")
public class Root {
    private String table;
    private String currency;
    @ApiModelProperty("unique code of currency")
    private String code;
    @ApiModelProperty("rates of currency")
    private List<Rate> rates;
}
