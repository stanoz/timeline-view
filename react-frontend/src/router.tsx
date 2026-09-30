import {createBrowserRouter, Navigate} from "react-router";
import Layout from "./layout/Layout.tsx";
import MainPage from "./pages/MainPage.tsx";
import AddEventForm from "./pages/add-event/AddEventForm.tsx";

export const router = createBrowserRouter([
    {
        path: "/",
        element: <Layout/>,
        children: [
            {
                index: true,
                element: <Navigate to="/timeline" replace/>,
            },
            {
                path: "timeline",
                element: <MainPage/>
            },
            {
                path: "add-event",
                element: <AddEventForm />
            }
        ]
    }
]);