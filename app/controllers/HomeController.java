package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(index.render("Your new application is ready."));
    }


    public Result assetTest(Object thing){
      return ok(assetTemplate.render(views.html.assetGroups.render()));//views.assetGroups.html
    }

    //////////Deelete as soon as you make sure the others all have functions
    /// will delete this soon
    public Result Agreement(){
      return ok(assetTemplate.render(views.html.
      assetAgreements
      .render()));//views.assetGroups.html
    }


    public Result AssetAgreement(){
      return ok(assetTemplate.render(views.html.
      assetAssetAgreements
      .render()));//views.assetGroups.html
    }

    public Result Building(){
      return ok(assetTemplate.render(views.html.
      assetBuildings
      .render()));//views.assetGroups.html
    }
    public Result Group(){
      return ok(assetTemplate.render(views.html.
      assetGroups
      .render()));//views.assetGroups.html
    }
    public Result IP(){
      return ok(assetTemplate.render(views.html.
      assetIPs
      .render()));//views.assetGroups.html
    }
    public Result Manufacturer(){
      return ok(assetTemplate.render(views.html.
      assetManufacturers
      .render()));//views.assetGroups.html
    }
    public Result Master(){
      return ok(assetTemplate.render(views.html.
      assetMaster
      .render()));//views.assetGroups.html
    }
    public Result Note(){
      return ok(assetTemplate.render(views.html.
      assetNotes
      .render()));//views.assetGroups.html
    }
    public Result NoteType(){
      return ok(assetTemplate.render(views.html.
      assetNoteTypes
      .render()));//views.assetGroups.html
    }
    public Result Owner(){
      return ok(assetTemplate.render(views.html.
      assetOwner
      .render()));//views.assetGroups.html
    }
    public Result OwnerGroup(){
      return ok(assetTemplate.render(views.html.
      assetOwnerGroup
      .render()));//views.assetGroups.html
    }
    public Result Printer(){
      return ok(assetTemplate.render(views.html.
      assetPrinters
      .render()));//views.assetGroups.html
    }
    public Result ServiceType(){
      return ok(assetTemplate.render(views.html.
      assetServiceTypes
      .render()));//views.assetGroups.html
    }
    public Result Type(){
      return ok(assetTemplate.render(views.html.
      assetTypes
      .render()));//views.assetGroups.html
    }
    public Result Vendor(){
      return ok(assetTemplate.render(views.html.
      assetVendors
      .render()));//views.assetGroups.html
    }

}
