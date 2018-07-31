import React, { Component } from 'react';
import { connect } from "react-redux";
import { fetchNotes } from "../actions";

class NotesList extends Component {
  componentDidMount() {
    this.props.fetchNotes();
  }

  render() {
    return (
        <ul>
          {this.props.notes.map(note => {
            // console.log("Note: " + note[0].id);
            return (
              <li key={note.id}>
                {note.text}
              </li>
            );
          })}
        </ul>
    );
  }
}

function mapStateToProps(state) {
  return { notes: state.notes };
}

export default connect(mapStateToProps, { fetchNotes })(NotesList);
