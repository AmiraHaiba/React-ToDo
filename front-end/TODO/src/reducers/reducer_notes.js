import { FETCH_NOTES } from "../actions"

export default function NotesReducer(state = [], action) {
  switch (action.type) {
    case FETCH_NOTES:
    console.log(action);
      return [...state , ...action.payload.data];
      break;
    default:
      return state;
  }
}
