package q04prototype

object AccessControlProvider {

  private val map = scala.collection.mutable.Map[String, AccessControl]()

  println("Fetching data from external resources and creating access control objects...")

  // UNCOMMENT
  map.put("USER", new AccessControl("USER", "DO_WORK"))

  map.put("ADMIN", new AccessControl("ADMIN", "ADD/REMOVE USERS"))

  map.put("MANAGER", new AccessControl("MANAGER", "GENERATE/READ REPORTS"))

  map.put("VP", new AccessControl("VP", "MODIFY REPORTS"))

  def getAccessControlObject(controlLevel: String): AccessControl = map(controlLevel)

}