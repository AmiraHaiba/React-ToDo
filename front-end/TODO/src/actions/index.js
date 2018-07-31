import axios from 'axios';

export const FETCH_NOTES = "fetch_notes";
const URL = "http://localhost:8080/TODO/notes/all";
export function fetchNotes() {
  const request = axios.get(URL);
  return {
    type: FETCH_NOTES,
    payload: request
  };
};
