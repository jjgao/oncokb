package org.mskcc.cbio.oncokb.api.pub.v1;

import io.swagger.annotations.*;
import org.mskcc.cbio.oncokb.apiModels.ApiErrorResp;
import org.mskcc.cbio.oncokb.apiModels.ApiListResp;
import org.mskcc.cbio.oncokb.model.Alteration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-10-19T19:28:21.941Z")

@Api(value = "variants", description = "The variants API")
public interface VariantsApi {

    @ApiOperation(value = "", notes = "Get all annotated variants.", response = Alteration.class, responseContainer = "List", tags = {"Variants",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Alteration.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
    ResponseEntity<ApiListResp> variantsGet();


    @ApiOperation(value = "", notes = "Search for variants.", response = Alteration.class, responseContainer = "List", tags = {"Variants", "Search",})
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "OK", response = Alteration.class, responseContainer = "List"),
        @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/lookup",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
    ResponseEntity<ApiListResp> variantsLookupGet(
        @ApiParam(value = "The entrez gene ID.") @RequestParam(value = "entrezGeneId", required = false) Integer entrezGeneId
        , @ApiParam(value = "The gene symbol used in Human Genome Organisation.") @RequestParam(value = "hugoSymbol", required = false) String hugoSymbol
        , @ApiParam(value = "variant name.") @RequestParam(value = "variant", required = false) String variant
        , @ApiParam(value = "") @RequestParam(value = "variantType", required = false) String variantType
        , @ApiParam(value = "") @RequestParam(value = "consequence", required = false) String consequence
//        , @ApiParam(value = "") @RequestParam(value = "refResidues", required = false) String refResidues
        , @ApiParam(value = "") @RequestParam(value = "proteinStart", required = false) Integer proteinStart
        , @ApiParam(value = "") @RequestParam(value = "proteinEnd", required = false) Integer proteinEnd
//        , @ApiParam(value = "") @RequestParam(value = "variantResidues", required = false) String variantResidues
    );

//    @ApiOperation(value = "", notes = "Get list of evidences for specific variant.", response = Evidence.class, responseContainer = "List", tags = {"Evidence",})
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "OK", response = Evidence.class, responseContainer = "List"),
//    @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/{variantId}/evidences",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
//    ResponseEntity<ApiListResp> variantsVariantIdEvidencesGet(
//        @ApiParam(value = "Variant unique identifier, maintained by OncoKB. The ID may be changed.", required = true) @PathVariable("variantId") Integer variantId
//        , @ApiParam(value = "Separate by comma. Evidence type includes MUTATION_SUMMARY, ONCOGENIC, MUTATION_EFFECT, VUS") @RequestParam(value = "evidenceTypes", required = false) String evidenceTypes
//    );
//
//
//    @ApiOperation(value = "", notes = "Get the sepecific variant.", response = Alteration.class, tags = {"Variant",})
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "OK", response = Alteration.class),
//        @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/{variantId}",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
//    ResponseEntity<ApiObjectResp> variantsVariantIdGet(
//        @ApiParam(value = "Variant unique identifier, maintained by OncoKB. The ID may be changed.", required = true) @PathVariable("variantId") Integer variantId
//    );
//
//
//    @ApiOperation(value = "", notes = "Get list of treatments for specific variant.", response = Treatment.class, responseContainer = "List", tags = {"Treatment",})
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "OK", response = Treatment.class, responseContainer = "List"),
//        @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/{variantId}/treatments",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
//    ResponseEntity<ApiObjectResp> variantsVariantIdTreatmentsGet(
//        @ApiParam(value = "Variant unique identifier, maintained by OncoKB. The ID may be changed.", required = true) @PathVariable("variantId") Integer variantId
//    );
//
//
//    @ApiOperation(value = "", notes = "Get list of annotated tumor types for specific variant.", response = OncoTreeType.class, responseContainer = "List", tags = {"TumorType",})
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "OK", response = OncoTreeType.class, responseContainer = "List"),
//        @ApiResponse(code = 400, message = "variant is not available.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/{variantId}/tumorTypes",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
//    ResponseEntity<ApiListResp> variantsVariantIdTumorTypesGet(
//        @ApiParam(value = "Variant unique identifier, maintained by OncoKB. The ID may be changed.", required = true) @PathVariable("variantId") Integer variantId
//    );
//
//
//    @ApiOperation(value = "", notes = "Get list of treatments for specific variant, tumor type.", response = Treatment.class, responseContainer = "List", tags = {"Treatment",})
//    @ApiResponses(value = {
//        @ApiResponse(code = 200, message = "OK", response = Treatment.class, responseContainer = "List"),
//        @ApiResponse(code = 400, message = "Error, error message will be given.", response = ApiErrorResp.class)})
//    @RequestMapping(value = "/variants/{variantId}/tumorTypes/{oncoTreeCode}/treatments",
//        produces = {"application/json"},
//        method = RequestMethod.GET)
//    ResponseEntity<ApiListResp> variantsVariantIdTumorTypesOncoTreeCodeTreatmentsGet(
//        @ApiParam(value = "Variant unique identifier, maintained by OncoKB. The ID may be changed.", required = true) @PathVariable("variantId") Integer variantId
//        , @ApiParam(value = "OncoTree tumor types unique code.", required = true) @PathVariable("oncoTreeCode") String oncoTreeCode
//    );

}
