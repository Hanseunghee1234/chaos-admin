package com.freeive.chaos.admin.common.controller;

public class Board{
  
  private String editor_seq;
  private String editor_title;
  private String editor_contents;

  /**
   * @return the editor_seq
   */
  public String getEditor_seq() {
    return editor_seq;
  }


  /**
   * @param seq the editor_seq to set
   */
  public void setEditor_seq(String editor_seq) {
    this.editor_seq = editor_seq;
  }


  /**
   * @return the editor_title
   */
  public String getEditor_title() {
    return editor_title;
  }


  /**
   * @param editor_title the editor_title to set
   */
  public void setEditor_title(String editor_title) {
    this.editor_title = editor_title;
  }


  /**
   * @return the editor_contents
   */
  public String getEditor_contents() {
    return editor_contents;
  }


  /**
   * @param editor_contents the editor_contents to set
   */
  public void setEditor_contents(String editor_contents) {
    this.editor_contents = editor_contents;
  }

  public Board(String editor_seq, String editor_title, String editor_contents){
    super();
    this.editor_seq = editor_seq;
    this.editor_title = editor_title;
    this.editor_contents = editor_contents;
  }

  public Board(String editor_title, String editor_contents){
    super();
    this.editor_title = editor_title;
    this.editor_contents = editor_contents;
  }


  public Board() {
  }
}

