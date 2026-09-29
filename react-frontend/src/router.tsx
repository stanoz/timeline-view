import {createBrowserRouter} from "react-router";
import Layout from "./layout/Layout.tsx";

export const router = createBrowserRouter([
    {
        path: "/",
        element: <Layout />
    }
]);