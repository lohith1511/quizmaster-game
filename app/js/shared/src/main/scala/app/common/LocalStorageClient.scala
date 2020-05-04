package app.common

import org.scalajs.dom

object LocalStorageClient {

  def setCurrentTeamName(name: String): Unit = {
    dom.window.localStorage.setItem("current-team-name", name)
  }
  def getCurrentTeamName(): Option[String] = {
    Option(dom.window.localStorage.getItem("current-team-name"))
  }

  def setMasterPassword(password: String): Unit = {
    dom.window.localStorage.setItem("master-password", password)
  }
  def getMasterPassword(): Option[String] = {
    Option(dom.window.localStorage.getItem("master-password"))
  }
}
